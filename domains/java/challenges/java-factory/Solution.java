
            if(Pizza.class.getName().equalsIgnoreCase(order)){
                return new Pizza();
            }
            if(Cake.class.getName().equalsIgnoreCase(order)){
                return new Cake();
            }
            return null;

