package Den_polymorphism_slave_parent;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

abstract class GodParent {
    @Override
    public String toString () {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.setVisibilityChecker(mapper.getSerializationConfig().getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));

        String result = "";
        try {
            result = mapper.writeValueAsString(
                    getThis()
            );
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    abstract Parent getThis();
}
