package com.felipe.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record BookData(@JsonAlias("id") long id,
                       @JsonAlias("title") String title,
                       @JsonAlias("authors") String authors,
                       @JsonAlias("languages") String languages) {
}
