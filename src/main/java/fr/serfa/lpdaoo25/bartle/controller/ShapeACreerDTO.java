package fr.serfa.lpdaoo25.bartle.controller;

import fr.serfa.lpdaoo25.bartle.model.Shape;

public record ShapeACreerDTO(Shape.ShapeType type, int length, int height, Shape.ShapeColor color) {
}
