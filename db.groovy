import groovy.sql.Sql;
import java.util.ServiceLoader;
import java.sql.Driver;

ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
def sql = Sql.newInstance('jdbc:oracle:thin:@oracle.st.atmo.ctco-fgls.projects.epam.com:1521:aecm', 'hybris_st_aecm', 'hybris_st_aecm', 'oracle.jdbc.OracleDriver')
sql.execute 'select * from addresses FETCH FIRST 2 ROWS ONLY'
sql.close()