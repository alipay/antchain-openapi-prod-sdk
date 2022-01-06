// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class DeleteSgServiceratelimitrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 是否启用
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

        // 限流规则id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 限流规则名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 资源类型
        [NameInMap("resource_type")]
        [Validation(Required=false)]
        public string ResourceType { get; set; }

        // {"limitStrategy":"ScaledRateLimiter","actionConfig":{"actionType":"LIMIT_EXCEPTION","responseContent":"ssssssssssddd"},"maxBurstRatio":"1","resourceConfigs":[{"method":"方法名","interface":"接口名","baseName":"com.alipay.uctcloud.service.IndicatorClient:1.0@DEFAULT.query","resourceType":"DATA_ID_METHOD"}],"runMode":"CONTROL","calculationConfigs":[{"calculationType":"INVOKE_BY_TIME","period":1000,"trafficType":"ALL","maxAllow":0}],"desc":"测试规则2","resourceType":"DATA_ID_METHOD"}
        [NameInMap("rule_config")]
        [Validation(Required=false)]
        public string RuleConfig { get; set; }

        // 运行模式
        [NameInMap("run_mode")]
        [Validation(Required=false)]
        public string RunMode { get; set; }

        // 服务框架类型
        [NameInMap("service_type")]
        [Validation(Required=false)]
        public string ServiceType { get; set; }

    }

}
