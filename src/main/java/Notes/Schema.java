package Notes;

public class Schema {
    /**
     * <h1>Schema</h1>
     * <p>
     *     <strong>This allows that when springboot starts up it checks if tables in a database exist and if they done it creates them</strong>
     *
     * </p>
     * <p>
     *     <small>
     *         <strong>The filename should be named as schema and have the sql extension</strong>
     *     </small>
     * </p>
     * <p>
     *     <strong>The data file with a sql extension initiates data in the database</strong>
     * </p>
     * <p>
     *     These files are created in the resources directory
     * </p>
     * <p>For this to work we need to set spring.sql.init.mode = always in the applications.properties file</p>
     */
    public Schema() {
    }
}
