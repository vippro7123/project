package com.sopvn.demosingleton;

import com.sopvn.demosingleton.model.business.Students;
import com.sopvn.demosingleton.model.db.DbConnection;
import com.sopvn.demosingleton.model.db.MyList;
import com.sopvn.demosingleton.model.entities.Student;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    public static Students lsStudent=new Students();
    @FXML
    private void switchToSecondary() throws IOException {
        //App.setRoot("secondary");
        Student st=new Student();
        //lay du lieu tu form
        st.setId(1);
        st.setName("john");
        //lsStudent.add(st);
        MyList<Student> ml=new MyList();
        ml.Add(st);
    }
}
