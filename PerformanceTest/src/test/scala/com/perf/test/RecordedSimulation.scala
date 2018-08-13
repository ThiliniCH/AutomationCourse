package com.perf.test

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:8080")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_0 = Map(
		"Accept-Language" -> "en-US,en;q=0.9",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "http://localhost:8080",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "identity",
		"Range" -> "bytes=0-4874",
		"User-Agent" -> "Microsoft BITS/7.8")

	val headers_4 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "identity",
		"Range" -> "bytes=4875-11546",
		"User-Agent" -> "Microsoft BITS/7.8")

    val uri1 = "http://blob.weather.microsoft.com/static/mws-new/WeatherImages/210x173/27.jpg"
    val uri2 = "http://localhost:8080/sample1_war_exploded"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/sample1_war_exploded/")
			.headers(headers_0))
		.pause(16)
		.exec(http("request_1")
			.post("/sample1_war_exploded/SaveName.jsp")
			.headers(headers_1)
			.formParam("username", "root")
			.formParam("pin", "453535")
			.formParam("amount", "6000"))
		.pause(13)
		.exec(http("request_2")
			.get("/sample1_war_exploded/NextPage.jsp")
			.headers(headers_0))
		.pause(27)
		.exec(http("request_3")
			.get(uri1 + "?a")
			.headers(headers_3))
		.pause(10)
		.exec(http("request_4")
			.get(uri1 + "?a")
			.headers(headers_4))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}