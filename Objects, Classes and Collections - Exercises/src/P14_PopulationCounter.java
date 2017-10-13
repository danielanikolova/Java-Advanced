import java.util.*;


public class P14_PopulationCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, HashMap<String, Long>> resultList = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("report")){

            String[]tokens = input.split("\\|");

            String city = tokens[0];
            String country = tokens[1];
            Long population = Long.parseLong(tokens[2]);
            HashMap<String, Long> cityPopulation = new HashMap<>();

            if (!resultList.containsKey(country)){
                cityPopulation.put(city, population);
                resultList.put(country,cityPopulation);
            }else {
                cityPopulation.put(city, population);
                if (!resultList.get(country).containsKey(city)){
                    cityPopulation.put(city, population);
                    resultList.get(country).put(city, population);
                }
            }

            input = scanner.nextLine();
        }


        Map<String, Long> countriesByPopulation = new LinkedHashMap<>();

        for (String country:resultList.keySet()) {
            Long population =0l;

            for (Long populationCount:resultList.get(country).values()) {
                population+=populationCount;
            }
            countriesByPopulation.put(country, population);
        }

        Map<String, Long> sortedCountries = new LinkedHashMap<>();

        countriesByPopulation.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(c-> sortedCountries.put(c.getKey(), c.getValue()));

        for (String country:sortedCountries.keySet()) {
            System.out.printf("%s (total population: %d)\n", country, sortedCountries.get(country));

        resultList.get(country).entrySet().stream()
                .sorted(Map.Entry.comparingByValue((b1, b2)->b2.compareTo(b1)))
                .forEach(entry-> {
                    System.out.println("=>" + entry.getKey() + ": " + entry.getValue());
                });

        }

    }
}
