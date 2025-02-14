class VarArgs{

    static int sum(int ... data){
        int s = 0;
        for(int x : data){
            s += x;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));
        System.out.println(sum(1));
        System.out.println(sum());
    }
}