package steps.com.herokuappSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataTableSteps {
    @Given("the user print the product titles")
    public void the_user_print_the_product_titles(DataTable dataTable) {
        List<String> productInfo = dataTable.asList(); //convert data table to list
        for (String info : productInfo) {
            System.out.println(info);
        }
    }

    @Then("the user print credentials")
    public void the_user_print_credentials(DataTable dataTable) {
        Map<String, String> credentials = dataTable.asMap(String.class, String.class);
        //type of key and value(map data type)

        Set<String> keys = credentials.keySet();
        for (String key : keys) {
            System.out.println("key: " + key + "Value: " + credentials.get(key));
        }
    }

    @Then("the user print product info")
    public void the_user_print_product_info(List<List<String>> products) {
        //print out the values from data table
        //the output will look like data table

        for (List<String> row : products) {

            for (String detail : row) {

                System.out.print("| " + detail);

            }
            System.out.print(" | ");
            System.out.println();
        }

    }
    @Then("the user print product details")
    public void the_user_print_product_details(io.cucumber.datatable.DataTable dataTable) {
       List<Map<String,String>>details=dataTable.asMaps();

       for (Map<String,String> detail:details){
           for (String key: detail.keySet()){
               System.out.println("Key: " + key + " Value: " + detail.get(key));
           }
           System.out.println("************************************");
       }
    }
}