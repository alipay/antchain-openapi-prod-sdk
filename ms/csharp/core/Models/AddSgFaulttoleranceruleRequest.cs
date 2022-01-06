// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddSgFaulttoleranceruleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // app名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 规则名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 具体规则项
        // {"appName":"testApp","name":"test23","ruleItemList":[{"conditions":[{"type":"system","field":"targetApp","operation":"IN","value":["A"]}],"configs":{"timeWindow":10,"leastWindowCount":100,"maxIpCount":3,"exceptionRateMultiple":3,"leastExceptionRate":10,"exceptionTypes":["500"]},"actions":[{"type":"DOWNGRADE"}]}]}
        [NameInMap("rule_item_list")]
        [Validation(Required=true)]
        public string RuleItemList { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 取值client,server二选1，默认是client
        [NameInMap("direction")]
        [Validation(Required=false)]
        public string Direction { get; set; }

    }

}
