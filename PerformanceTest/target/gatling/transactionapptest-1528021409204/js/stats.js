var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "10",
        "ok": "10",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "132",
        "ok": "132",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "5033",
        "ok": "5033",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1586",
        "ok": "1586",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1757",
        "ok": "1757",
        "ko": "-"
    },
    "percentiles1": {
        "total": "593",
        "ok": "593",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2784",
        "ok": "2784",
        "ko": "-"
    },
    "percentiles3": {
        "total": "4581",
        "ok": "4581",
        "ko": "-"
    },
    "percentiles4": {
        "total": "4943",
        "ok": "4943",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 5,
        "percentage": 50
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 1,
        "percentage": 10
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 4,
        "percentage": 40
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "1.667",
        "ok": "1.667",
        "ko": "-"
    }
},
contents: {
"req_load-initial-sc-ba78d": {
        type: "REQUEST",
        name: "Load Initial Screen",
path: "Load Initial Screen",
pathFormatted: "req_load-initial-sc-ba78d",
stats: {
    "name": "Load Initial Screen",
    "numberOfRequests": {
        "total": "5",
        "ok": "5",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "132",
        "ok": "132",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "162",
        "ok": "162",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "143",
        "ok": "143",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "11",
        "ok": "11",
        "ko": "-"
    },
    "percentiles1": {
        "total": "141",
        "ok": "141",
        "ko": "-"
    },
    "percentiles2": {
        "total": "145",
        "ok": "145",
        "ko": "-"
    },
    "percentiles3": {
        "total": "159",
        "ok": "159",
        "ko": "-"
    },
    "percentiles4": {
        "total": "161",
        "ok": "161",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 5,
        "percentage": 100
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "0.833",
        "ok": "0.833",
        "ko": "-"
    }
}
    },"req_transaction-pro-d0912": {
        type: "REQUEST",
        name: "Transaction Process Request",
path: "Transaction Process Request",
pathFormatted: "req_transaction-pro-d0912",
stats: {
    "name": "Transaction Process Request",
    "numberOfRequests": {
        "total": "5",
        "ok": "5",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1023",
        "ok": "1023",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "5033",
        "ok": "5033",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3030",
        "ok": "3030",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1417",
        "ok": "1417",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3036",
        "ok": "3036",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4029",
        "ok": "4029",
        "ko": "-"
    },
    "percentiles3": {
        "total": "4832",
        "ok": "4832",
        "ko": "-"
    },
    "percentiles4": {
        "total": "4993",
        "ok": "4993",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 0,
        "percentage": 0
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 1,
        "percentage": 20
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 4,
        "percentage": 80
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "0.833",
        "ok": "0.833",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
