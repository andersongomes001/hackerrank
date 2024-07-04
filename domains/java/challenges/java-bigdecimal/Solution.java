
        List<Map.Entry<String, BigDecimal>> newMap = new ArrayList<>();
        for (String x : s) {
            if(x != null){
                newMap.add(new AbstractMap.SimpleEntry(x,new BigDecimal(x)));
            }
        }
        newMap.sort(
            new Comparator<Map.Entry<String, BigDecimal>>() {
                @Override
                public int compare(Map.Entry<String, BigDecimal> v1, Map.Entry<String, BigDecimal> v2){
                    BigDecimal value1 = v1.getValue();
                    BigDecimal value2 = v2.getValue();
                    if (value1.compareTo(value2) == 0) {
                        return 0;
                    } else if (value1.compareTo(value2) < 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        );
        s = newMap.stream().map(x -> x.getKey()).toArray(String[]::new);
