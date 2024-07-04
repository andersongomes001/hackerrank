

    static boolean isAnagram(String a, String b) {
        java.util.List<String> A = java.util.Arrays.asList(a.toUpperCase().split(""));
        java.util.List<String> B = java.util.Arrays.asList(b.toUpperCase().split(""));
        java.util.Collections.sort(A);
        java.util.Collections.sort(B);
        return (A.equals(B));
    }

