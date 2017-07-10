package spring.jdbcframework.sqlstoredprocedure;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentMapper implements RowMapper{

    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        return student;
    }

    // ??????????????????????????
    public int[] getRowsForPaths(TreePath[] path) {
        return new int[0];
    }
}
