public class CustomerManager {

    static BaseDatabaseManager databaseManager;
    // BaseDatabaseManager diger class larda extends edildigi icin nesne gonderdik.
    // databaseManager nesnesinin olmasi extends ettigimiz her sinifi kullanabilecegimiz anlamina geliyor.

    public void getCustomers(){

        databaseManager.getData();
        // extends edilen sinif uzerinden getData() methodunu cagirmis olduk.

    }



}
