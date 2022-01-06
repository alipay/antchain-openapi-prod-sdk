// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class SaveSgAuthrulegroupsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // {"type":"WHITELIST","enabled":0,"instanceId":"000001","dataId":"com.alipay.antcloud.drmdata.facade.PushFacade:1.0@DEFAULT","rules":[{"ruleItems":[{"type":"SYSTEM","operation":"EQUAL","field":"source.application.id","value":"app1"}],"enabled":0,"name":"rule1"}]}
        [NameInMap("auth_rule_group")]
        [Validation(Required=true)]
        public string AuthRuleGroup { get; set; }

        // 服务鉴权接口id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 租户instanceId
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

    }

}
