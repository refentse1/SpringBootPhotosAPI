package Notes;

public class RestController {
    /**
     *<h1>Rest Controller</h1>
     * <p>
     *     <strong>RestController</strong> is an class annotation, that indicates that the class will have Rest endpoints.
     * </p>
     *<br>
     * <h3>RequestMapping</h3>
     * <p>
     *     Methods for this class, that handle request will have a requestTypeMapping annotation i.e
     * </p>
     * <p>
     *     For get requests: <strong>GetMapping()</strong>
     * </p>
     * <p>This is for the requestType endpoint the parameter takes in the path</p>
     * <br>
     * <h3>PathVariable</h3>
     * <p>Given that we want to pass some parameter to the path we can do so by adding the variable to the url and enclose it in curly braces in the path that goes to the method annotation</p>
     * <p>We can then get access to it by adding a parameter to the method and before it using the annotation PathVariable, which declares that this parameter is coming from the url path</p>
     * <p>
     *     <small>
     *         <strong>Just like in node and Express the variable name in the annotation must be similar to that in the method declaration</strong>
     *     </small>
     * </p>
     * <br>
     * <h3>RequestBody</h3>
     * <p>
     *     When a request will receive a body from the user we use the RequestBody annotation inside the method definition where we specify a parameter
     * </p>
     * <p><strong>The request body annotation declares/defines that this parameter will be coming from the body of the request.</strong></p>
     * <br>
     * <h3>Validation</h3>
     * <p>We can use the Valid annotation on the data that we receive from the request body to make sure it is valid. This can be used given that the data we will receive from the body will have a defined interface.</p>
     */
    public RestController() {
    }
}
