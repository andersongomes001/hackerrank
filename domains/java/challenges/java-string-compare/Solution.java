

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.List<String> lista = new java.util.ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int start = i;
            if(i+k > s.length()){
                start = s.length() - k;
            }
            if(!lista.contains(s.substring(start,start+k))){
                lista.add(s.substring(start, start+k));
            }
            java.util.Collections.sort(lista);
            smallest = lista.get(0);
            largest = lista.get(lista.size()-1);
        }
        return smallest + "\n" + largest;
    }

