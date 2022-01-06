// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddSgCircuitbreakerrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名
        [NameInMap("app_names")]
        [Validation(Required=true)]
        public string AppNames { get; set; }

        // 熔断配置信息，json串。例: [{
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

        // 生效场景
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public string Conditions { get; set; }

        // 熔断规则
        [NameInMap("config")]
        [Validation(Required=false)]
        public string Config { get; set; }

        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 当service_type的值为SPRINGCLOUD时必传，后端拼接到trafficCondition中。
        // 取值范围(GET,POST,PUT,DELETE)
        [NameInMap("http_method")]
        [Validation(Required=false)]
        public string HttpMethod { get; set; }

        // http的路径值，当service_type的值为SPRINGCLOUD时必填,后端拼接到trafficCondition中
        [NameInMap("http_path")]
        [Validation(Required=false)]
        public string HttpPath { get; set; }

        // 租户id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 方法名称，"*"代表全部方法,当serviceType为SPRINGCLOUD时不传
        [NameInMap("method_name")]
        [Validation(Required=false)]
        public string MethodName { get; set; }

        // 运行模式
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 规则名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 资源标识，资源格式是serviceId:trafficType:resType
        [NameInMap("resource")]
        [Validation(Required=false)]
        public string Resource { get; set; }

        // resType，resource组成的一部分
        // r-rpc(默认), g-gateway, q-mq
        [NameInMap("res_type")]
        [Validation(Required=false)]
        public string ResType { get; set; }

        // serviceType，取值(SPRINGCLOUD,SOFA,DUBBO)
        [NameInMap("service_type")]
        [Validation(Required=false)]
        public string ServiceType { get; set; }

        // 流量方法(o-outbind消费端,i-inbind服务端)
        [NameInMap("traffic_type")]
        [Validation(Required=false)]
        public string TrafficType { get; set; }

    }

}
