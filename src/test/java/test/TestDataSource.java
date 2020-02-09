package test;

import com.bishe.bookstoreuser.UserBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {UserBootApplication.class})
public class TestDataSource {

    @Autowired
    private DataSource ds;

    @Test
    public void test1(){
        System.out.println(ds);
    }

}
