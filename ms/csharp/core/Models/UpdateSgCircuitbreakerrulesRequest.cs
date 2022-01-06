// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class UpdateSgCircuitbreakerrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名称
        [NameInMap("app_names")]
        [Validation(Required=true)]
        public string AppNames { get; set; }

        // 熔断规则配置  [{
        //         "ruleType": "",//熔断规则类型 ce,crt,pe,prt(c代表消费方,p代表服务方,e代表错误率,rt响应时间)
        //         "configs": {
        //             "errorPercentThreshold": 50,//请求错误率阈值
        //             "requestVolumeThreshold": 100,//请求数阈值
        //             "averageRtThreshold":50,//平均RT阈值
        //             "providerTimeout": 100,//服务超时时间
        //             "sleepWindow": 10000,//熔断时间段
        //             "totalMetricWindow": 60,//熔断指标窗口
        //             "codeType": "error/success",
        //             "codes": [
        //                 "200",
        //                 "201",
        //                 "202"
        //             ]
        //         },
        //         "trafficConditions": [{
        //             "field": "sourceApp",//sourceApp,trafficType(此时value取online,test),header
        //             "operation": "EQUAL",//EQUAL,NOT_EQUAL,IN,NOT_IN,REGEX
        //             "type": "system",//system,tracer,header_info
        //             "value": [//当field取trafficType时value取online,test
        //                 "cloudinc"
        //             ]
        //         }],
        //         "action": {
        //             "type": "REJECT/PASS"
        //         }
        //     }]
        [NameInMap("circuit_breaker_rule_items")]
        [Validation(Required=false)]
        public string CircuitBreakerRuleItems { get; set; }

        // 生效条件，JSON数组
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public string Conditions { get; set; }

        // 熔断配置
        [NameInMap("config")]
        [Validation(Required=false)]
        public string Config { get; set; }

        // 资源id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 当service_type的值为SPRINGCLOUD时必传，值取(GET、POST、PUT、DELETE)，后端拼接到trafficConditions中
        [NameInMap("http_method")]
        [Validation(Required=false)]
        public string HttpMethod { get; set; }

        // 当service_type的值为SPRINGCLOUD时必传，后端拼接到trafficConditions中
        [NameInMap("http_path")]
        [Validation(Required=false)]
        public string HttpPath { get; set; }

        // 	
        // 熔断规则id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 租户id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 方法名称，当service_type的值为SPRINGCLOUD时不传
        [NameInMap("method_name")]
        [Validation(Required=false)]
        public string MethodName { get; set; }

        // 熔断规则运行模式
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 规则名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 资源标识，资源格式是serviceId:trafficType:resType
        [NameInMap("resource")]
        [Validation(Required=false)]
        public string Resource { get; set; }

        // res的type,组成resource，取值r-rpc(默认), g-gateway, q-mq
        [NameInMap("res_type")]
        [Validation(Required=false)]
        public string ResType { get; set; }

        // 取值i-inbound, o-outbound,组成resource的部分
        // i代表服务端，o代表消费端
        [NameInMap("traffic_type")]
        [Validation(Required=false)]
        public string TrafficType { get; set; }

    }

}
