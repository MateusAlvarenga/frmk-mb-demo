package pereira.mateus.frmkmbdemo.infra.MapperBuilder.maps;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import pereira.mateus.frmkmbdemo.infra.MapperBuilder.maps.Converter.IConverter;
import pereira.mateus.frmkmbdemo.infra.MapperBuilder.maps.Converter.LibraryConverter;


public class LibraryMapTest {

    @Test
    public void testLibraryMap(){
        IConverter<LibraryMap> libraryConverter = new LibraryConverter();
        LibraryMap libraryMap = libraryConverter.convert();

        Assert.notNull(libraryMap, "LibraryMap is null");
        Assert.notNull(libraryMap.maps(), "LibraryMap.maps() is null");
        Assert.notEmpty(libraryMap.maps(), "LibraryMap.maps() is empty");
        Assert.notNull(libraryMap.maps().getFirst(), "LibraryMap.maps().get(0) is null");
        Assert.notNull(libraryMap.maps().getFirst().fetchMap(), "LibraryMap.maps().get(0).fetchMap() is null");
        Assert.notEmpty(libraryMap.maps().getFirst().fetchMap(), "LibraryMap.maps().get(0).fetchMap() is empty");
        Assert.notNull(libraryMap.maps().getFirst().fetchMap().getFirst(), "LibraryMap.maps().get(0).fetchMap().get(0) is null");

    }
}
