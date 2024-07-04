

class Add {
    public void add(int... args){
        int response = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            response += args[i];
            if(i+1 < args.length){
                System.out.print("+");
            }
        }
        System.out.println(String.format("=%s", response));
    }
}

