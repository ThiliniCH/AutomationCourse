package com.perf.test
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class TransactionAppTest extends Simulation{

  var dataFeeder = csv("transaction.csv").circular

  var httpProtocol = http.baseURL("http://localhost:8080/sample1_war_exploded/")

  var scenario1 = scenario("Scenario 1")
    .exec(http("Load Initial Screen").get("/"))

  var scenario2 = scenario("Scenario 2").feed(dataFeeder)
    .exec(http("Load Initial Screen").get("/"))
    .exec(http("Transaction Process Request").post("/SaveName.jsp")
      .formParam("username","${UserName}").formParam("pin","${PIN}").formParam("amount","${Amount}"))
      .exec(http("Detail View").get("/NextPage.jsp"))




  setUp(scenario2.inject(rampUsers(5)over(10)).protocols(httpProtocol),
    scenario1.inject(constantUsersPerSec(2)during(10)).protocols(httpProtocol))


}
