import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public  class DatabaseTest {
@Test
    public void testConnection(){
    Database db = new Database();
    int conn = db.connect();
    Assertions.assertEquals(0,conn);


}
@Test
    public void testDisconnection(){
    Database db = new Database();
    int disconn = db.disconnect();
    Assertions.assertEquals(1,disconn);


}


}