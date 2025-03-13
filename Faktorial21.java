public class Faktorial21 {
    int FaktorialBF(int n){
        int faktor = 1;
        for (int i = 1; i <= n; i++) {
            faktor = faktor * i;
        }
        return faktor;
    }

    // pakai while
    // int FaktorialBF(int n){
    //     int faktor = 1;
    //     int i = 1;
    //     while(i <= n){
    //         faktor = faktor * i;
    //         i++;
    //     }
    //     return faktor;
    // }

    // pakai do while
    // int FaktorialBF(int n){
    //     int faktor = 1;
    //     int i = 1;
    //     do{
    //         faktor = faktor * i;
    //         i++;
    //     } while(i <=n);
    //     return faktor;
    // }

    int FaktorialDC(int n){
        if(n==1){
            return 1;
        } else {
            int faktor = n * FaktorialDC(n-1);
            return faktor;
        }
    }
}
