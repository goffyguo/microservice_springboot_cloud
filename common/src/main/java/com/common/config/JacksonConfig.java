package com.common.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * @author guofei
 * @date 2022/8/2 10:39 AM
 */
@Configuration
public class JacksonConfig {

  @Bean
  @Primary
  @ConditionalOnMissingBean(ObjectMapper.class)
  public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
    ObjectMapper objectMapper = builder.createXmlMapper(false).build();
    objectMapper.getSerializerProvider()
        .setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(
                Object o,
                JsonGenerator jsonGenerator,
                SerializerProvider serializerProvider)
                throws IOException {
                  jsonGenerator.writeString("");
                }
          });
    return objectMapper;
  }

}
