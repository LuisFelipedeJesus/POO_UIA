 public class ejercicio302 {
public static void main(String[] args){
    int i,j=0,bra='t';
    for(i=0;i<=797;i=i)
    {
        if(bra=='t')
        {
            i=i+2;
            bra='f';
        }
 else
        {
            i=i+3;
            bra='t';
        }
        System.out.println(+i);
    }
}

}