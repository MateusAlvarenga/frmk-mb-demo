package pereira.mateus.frmkmbdemo.infra.MapperBuilder;

 
import java.util.List;

public record LibraryMap(List<Map> maps) {

    public record Map(List<FetchMap> fetchMap) {
    }

    public record FetchMap(String id, List<Column> columns) {
    }

    public record Column(String name, String type) {
    }
}
