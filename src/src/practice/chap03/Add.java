/*
chap03 - 12
 */
package src.practice.chap03;

public class Add {

    public static void main(String[] args) {

        int sum=0;
        for(int i=0;i<args.length; i++){
            try{
                sum += Integer.parseInt(args[i]);
            }catch (NumberFormatException e){
                args[i]= "0" ;
                sum += Integer.parseInt(args[i]);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        System.out.println(sum);
    }
}
