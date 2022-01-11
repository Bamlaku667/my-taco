package com.bamlaku.tacos;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
        private Map<String, Ingredient> ingrMap = new HashMap<>();

        public IngredientByIdConverter() {
                ingrMap.put("FLTO", new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
                ingrMap.put("COTO", new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP));
                ingrMap.put("GRBF", new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN));
                ingrMap.put("CARN", new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN));
                ingrMap.put("TMTO", new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES));
                ingrMap.put("LETC", new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES));
                ingrMap.put("CHED", new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
                ingrMap.put("JACK", new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
                ingrMap.put("SLSA", new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
                ingrMap.put("SRCR", new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));
        }

        @Override
        public Ingredient convert(String id) {
                return ingrMap.get(id);
        }

}
