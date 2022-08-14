package demoInterface;

public class Test {
    public static void main(String[] args) {
        System.out.println("test câu a: ");
        MayTinhCasioFx500 mfx500 = new MayTinhCasioFx500();
        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();

        System.out.println("5+3 = " + mfx500.cong(5, 3));
        System.out.println("4*3 = " + mvn500.nhan(4, 3));
        System.out.println("4/0 = " + mvn500.chia(4, 0));

        System.out.println("test câu b: ");
        double[] arr = new double[]{5, 4, 3, 2, 4, 5, 6, 3};
        double[] arr2 = new double[]{4, 3, 45, 6, 7, 4, 4, 6};
        SapXepChen sxChen = new SapXepChen();
        SapXepChon sxChon = new SapXepChon();

        sxChen.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");


        }
        System.out.println("-------------");
        sxChon.sapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("--------------");
        System.out.println("Test câu c:");
        PhanMemMayTinh pmmt =new PhanMemMayTinh();
        System.out.println("3+5=" + pmmt.cong(3, 5));
        double[] arr3 = new double[] {6,2,7,9,2,4,5};
        pmmt.sapXepTang(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}