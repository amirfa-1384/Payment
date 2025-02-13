package ir.fa.Payment.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class Dashboard {
    private final Map<String, String> configValues = new HashMap<>();

    public Dashboard(@Value("${app.config.file}") String configFilePath) {
        loadConfig(configFilePath);
    }

    private void loadConfig(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new RuntimeException("Config file not found: " + filePath);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty() || line.startsWith("#")) continue;
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    configValues.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading config file", e);
        }
    }

    public String getConfigValue(String key) {
        return configValues.getOrDefault(key, null);
    }
}


