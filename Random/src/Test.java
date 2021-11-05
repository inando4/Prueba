public class Test {
    public static void main(String[] args) {
        Persona[] arr = new Persona[10];
        Persona p1 = new Persona("Diana", 18, "F");
        Persona p2 = new Persona("Juan", 20, "M");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Persona();
        }

        arr[5] = p1;
        arr[6] = p2;
        int n = OperacionesArray.<Persona>search(p1, arr);
        System.out.println("La posición es: " + n);
        OperacionesArray.<Persona>remove(p2, arr);
        for (Persona p : arr) 
            if(p != null)
                System.out.println(p);

    }
}
