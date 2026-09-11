public static ArrayList<Integer> updateEmployees(
    ArrayList<Integer> employees,
    int[] leftEmployees,
    int[] newEmployees
){
    for(int i = 0 ; i < leftEmployees.length ; i++){
        if(employees.contains(leftEmployees[i])){
            employees.remove(Integer.valueOf(leftEmployees[i]));
        }
    }
    for (int i = 0 ; i < newEmployees.length; i++){
        if(!employees.contains(newEmployees[i])){
            employees.add(Integer.valueOf(newEmployees[i]));
        }
    }
    return employees;
}
