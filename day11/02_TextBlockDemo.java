class TextBlockDemo {
    public static void main(String[] args) {
        String json = """
                        {
                            "name": "John",
                            "age": 25,
                            "city": "New York"
                        }
                            """; // ending quotes can be at any place - inline or in next line
        System.out.println(json);   
        //int _ = 90;  // _ can be used as a place holder, to fullfill the syntax . like in catch block to hold the excetion object, if dont use it.
        //System.out.println(_); //we cannot use this for any other purposes.. 
    }
}
