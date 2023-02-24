import java.util.Scanner;

public class SegmentTree {
    public static class init{
        static int N = 100_010;
        static int[] st = new int[2*N];
        static int[] arr = new int[N];
    }
    static SegmentTree.init obj = new SegmentTree.init();

    static void build(int id, int l, int r){

        if(l==r){
            obj.st[id] = obj.arr[l];
            return;
        }
        int m = l+(r-l)/2;
        build(2*id, l, m);
        build(2*id + 1, m+1, r);
        obj.st[id] = Math.min(obj.st[2*id], obj.st[2*id + 1]);
    }

    static int getMin(int id, int l, int r, int u, int v){

        if(l > v || r < u){
            return Integer.MAX_VALUE;
        }
        if(u <= l && r <= v){
            return obj.st[id];
        }
        int mid = (l + (r-l)/2);
        return  Math.min(getMin(2*id, l, mid, u, v), getMin(2*id + 1, mid+1, r, u, v));
    }
    static void update(int id, int l, int r, int i, int val){
        if(l > i || r < i){
            return;
        }
        if(l==r){
            obj.st[id] = val;
            return;
        }
        int mid = (l+r)>>1;
        update(2*id, l, mid, i , val);
        update(2*id + 1, mid + 1, r, i , val);
        obj.st[id] = Math.min(obj.st[2*id + 1], obj.st[2*id + 1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i =1 ; i<= n; i++){
            obj.arr[i] = sc.nextInt();
        }
        build(1, 1, n);
        for(int i = 1; i<= 2*n+1; i++){
            System.out.print(obj.st[i] + " ");
        }


    }
}
import java.util.Scanner;

public class SegmentTree {
    public static class init{
        static int N = 100_010;
        static int[] st = new int[2*N];
        static int[] arr = new int[N];
    }
    static SegmentTree.init obj = new SegmentTree.init();

    static void build(int id, int l, int r){

        if(l==r){
            obj.st[id] = obj.arr[l];
            return;
        }
        int m = l+(r-l)/2;
        build(2*id, l, m);
        build(2*id + 1, m+1, r);
        obj.st[id] = Math.min(obj.st[2*id], obj.st[2*id + 1]);
    }

    static int getMin(int id, int l, int r, int u, int v){

        if(l > v || r < u){
            return Integer.MAX_VALUE;
        }
        if(u <= l && r <= v){
            return obj.st[id];
        }
        int mid = (l + (r-l)/2);
        return  Math.min(getMin(2*id, l, mid, u, v), getMin(2*id + 1, mid+1, r, u, v));
    }
    static void update(int id, int l, int r, int i, int val){
        if(l > i || r < i){
            return;
        }
        if(l==r){
            obj.st[id] = val;
            return;
        }
        int mid = (l+r)>>1;
        update(2*id, l, mid, i , val);
        update(2*id + 1, mid + 1, r, i , val);
        obj.st[id] = Math.min(obj.st[2*id + 1], obj.st[2*id + 1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i =1 ; i<= n; i++){
            obj.arr[i] = sc.nextInt();
        }
        build(1, 1, n);
        for(int i = 1; i<= 2*n+1; i++){
            System.out.print(obj.st[i] + " ");
        }


    }
}
