//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //Task1

    Box<String> box = new Box<>("18");
    System.out.println(box.getValue());
    System.out.println(box.isEmpty());


    //Task2

    Pair<Integer,String> student = new Pair<>(1,"Ulvi");
    System.out.println(student.getKey());
    System.out.println(student.getValue());
    System.out.println(student);



}

//Task3

public <T> void swap(T[] arr, int i, int j){
    T k = arr[i];
    arr[i] = arr[j];
    arr[j] = k;
}

//Task4

public double sum(List<? extends Number> list){
    double total = 0;

    for(Number n : list){
        total += n.doubleValue();
    }

    return total;
}

//Task5

public void add(List<Integer> list, int n){
    for (int i = 0; i <= n ; i++) {
        list.add(i);
    }
}
