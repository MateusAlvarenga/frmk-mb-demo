package pereira.mateus.frmkmbdemo.infra.MapperBuilder.Builder;

import pereira.mateus.frmkmbdemo.infra.MapperBuilder.maps.LibraryMap;

import java.util.List;

import static java.lang.StringTemplate.STR;

public class BuilderTemplate {

    public static final String SELECT_ = "SELECT ";

    public static String select(String name) {
        return STR."sdafas";
    }

    public static String insert(String name) {
        return switch (name) {
            case "String" -> "VARCHAR(255)";
            case "Integer" -> "INTEGER";
            case "Long" -> "BIGINT";
            case "Double" -> "DOUBLE";
            case "Float" -> "FLOAT";
            case "Boolean" -> "BOOLEAN";
            case "Date" -> "DATE";
            case "LocalDate" -> "DATE";
            case "LocalDateTime" -> "TIMESTAMP";
            default -> "VARCHAR(255)";
        };
    }




    public static String select(LibraryMap.FetchMap fetchMap) {
        return """
           SELECT ${columns} FROM ${from}
           """.replace("${columns}", fetchMap.columns().stream()
                        .map(column -> column.name() + " as " + column.name())
                        .reduce((a, b) -> a + ", " + b)
                        .orElse(""))
                .replace("${from}", fetchMap.from());
    }

}
