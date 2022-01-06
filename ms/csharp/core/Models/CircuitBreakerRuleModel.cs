// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 服务熔断结果信息
    public class CircuitBreakerRuleModel : TeaModel {
        // 应用名，数组形式，一般只有一个
        [NameInMap("app_names")]
        [Validation(Required=true)]
        public List<string> AppNames { get; set; }

        // 统一熔断模型
        // "circuit_breaker_rule_items": [
        //             {
        //                 "ruleType": "avgRt",
        //                 "action": {
        //                     "type": "REJECT"
        //                 },
        //                 "configs": {
        //                     "totalMetricWindow": 10,
        //                     "requestVolumeThreshold": 10,
        //                     "averageRtThreshold": 50,
        //                     "sleepWindow": 1000
        //                 },
        //                 "trafficConditions": [
        //                     {
        //                         "type": "system",
        //                         "field": "trafficType",
        //                         "operation": "EQUAL",
        //                         "value": [
        //                             "online"
        //                         ]
        //                     }
        //                 ]
        //             }
        //         ],
        [NameInMap("circuit_breaker_rule_items")]
        [Validation(Required=false)]
        public List<CircuitBreakerRuleItemModel> CircuitBreakerRuleItems { get; set; }

        // 熔断生效条件
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<CircuitRuleBaseConditionModel> Conditions { get; set; }

        // 熔断配置
        [NameInMap("config")]
        [Validation(Required=false)]
        public CircuitBreakerConfigModel Config { get; set; }

        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 取值GET、POST、DELETE、PUT(serviceType为SPRINGCLOUD时才有值)
        [NameInMap("http_method")]
        [Validation(Required=false)]
        public string HttpMethod { get; set; }

        // 可以传*表示通配符(serviceType为SPRINGCLOUD时才有值)
        [NameInMap("http_path")]
        [Validation(Required=false)]
        public string HttpPath { get; set; }

        // 数据库自增id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 租户id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 方法名称(serviceType为SPRINGCLOUD时不传)
        [NameInMap("method_name")]
        [Validation(Required=false)]
        public string MethodName { get; set; }

        // 熔断生效模式
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 熔断规则名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // dataId.methodName:trfficType:resType(当serviceType类型为SPRINGCLOUD时结构为dataId:trfficType:resType)
        [NameInMap("resource")]
        [Validation(Required=false)]
        public string Resource { get; set; }

        // res的类型(r-rpc,g-gateway,q-mq)
        [NameInMap("res_type")]
        [Validation(Required=false)]
        public string ResType { get; set; }

        // 服务类型
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

        // 规则是否生效
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 流量方向(i-inbound,o-outbound)
        [NameInMap("traffic_type")]
        [Validation(Required=false)]
        public string TrafficType { get; set; }

    }

}
