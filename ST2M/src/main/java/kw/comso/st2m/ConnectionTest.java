package kw.comso.st2m;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConnectionTest {
    
    @Inject
    private DataSource ds; 
    
    @RequestMapping(value = "/contest", method = RequestMethod.GET)
    public void testConnection() throws Exception {
        try(Connection conn = ds.getConnection()) {
            System.out.println(conn);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
