public class Main {
    public static int add(int x, int y){
        return x+y;
    }

    public static int subtract(int x, int y){
        return x-y;
    }

    public static void main(String[] args){

        int add1= add(4,5);
        int add2=add(20,211);
        int add3=add(21,121);

        int sub1=subtract(110,20);
        int sub2=subtract(200,20);
        int sub3=subtract(10,8);


        int additionResults[] ={add1,add2,add3};
        int subtractionResults[]={sub1,sub2,sub3};

        for (int i=0; i<additionResults.length;i++){
            if(additionResults[i]%2==0)  {
                System.out.println("even "+additionResults[i]);

            }else {
                System.out.println("odd "+additionResults[i]);
            }

        }
        for (int i=0; i<subtractionResults.length;i++){
            if(subtractionResults[i]%2==0)  {
                System.out.println("even "+subtractionResults[i]);

            }else {
                System.out.println("odd "+subtractionResults[i]);
            }

        }

        int i=0;
        while (i<additionResults.length){
            if(subtractionResults[i]%2==0){
            System.out.print("even "+subtractionResults[i]+" ");
            }
            else {
                System.out.println("odd "+subtractionResults[i]+" ");
            }
            if(additionResults[i]%2==0){
                System.out.print("even "+additionResults[i]+" ");
            }
            else {
                System.out.print("odd "+additionResults[i]+" ");
            }
            i++;
        }

    }


}