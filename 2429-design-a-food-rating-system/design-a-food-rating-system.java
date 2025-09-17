
import java.util.*;

class FoodRatings {
    private static class Food implements Comparable<Food> {
        String name;
        String cuisine;
        int rating;

        Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }

        @Override
        public int compareTo(Food other) {
            if (this.rating != other.rating) {
                return Integer.compare(other.rating, this.rating); 
            }
            return this.name.compareTo(other.name); 
        }
    }

    private Map<String, Food> foodMap;                
    private Map<String, TreeSet<Food>> cuisineMap;    

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodMap = new HashMap<>();
        cuisineMap = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            Food food = new Food(foods[i], cuisines[i], ratings[i]);
            foodMap.put(foods[i], food);
            cuisineMap.computeIfAbsent(cuisines[i], k -> new TreeSet<>()).add(food);
        }
    }

    public void changeRating(String foodName, int newRating) {
        Food food = foodMap.get(foodName);
        TreeSet<Food> set = cuisineMap.get(food.cuisine);

        set.remove(food);           
        food.rating = newRating;    
        set.add(food);              
    }

    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).first().name; 
    }
}