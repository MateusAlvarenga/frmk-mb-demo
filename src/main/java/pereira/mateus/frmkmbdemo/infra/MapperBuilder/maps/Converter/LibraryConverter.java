package pereira.mateus.frmkmbdemo.infra.MapperBuilder.maps.Converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import pereira.mateus.frmkmbdemo.infra.MapperBuilder.maps.LibraryMap;
import java.io.InputStream;

public class LibraryConverter implements IConverter<LibraryMap> {


    private final ObjectMapper MAPPER = new ObjectMapper();
    protected final String RESOURCE_PATH = "./mapperMap/libraryMap.json";


    @SneakyThrows
    @Override
    public LibraryMap convert() {
        ClassLoader classLoader = LibraryConverter.class.getClassLoader();

        InputStream inputStream = classLoader.getResourceAsStream(RESOURCE_PATH);
        return MAPPER.readValue(inputStream, LibraryMap.class);
    }

}
