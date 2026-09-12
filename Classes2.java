class Employee{
    private int id; 
    private String name; 
    private int[] salary;

    public void getValues(int id, String name, int[] salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printValues(){
        System.out.println(id);
        System.out.println(name);

        for(int i = 0; i < 6; i++){
            System.out.print(salary[i] + " ");
        }

        System.out.println();
    }

    public int calTotalSalary(){
        int sum = 0; 

        for(int i = 0; i < 6; i++){
            sum += salary[i];
        }

        return sum;
    }

    public int maxSalary(){
        int max = salary[0];
        int month = 1;

        for(int i = 0; i < 6; i++){
            if(max < salary[i]){
                max = salary[i];
                month = i + 1;
            }
        }

        return month;
    }
}
