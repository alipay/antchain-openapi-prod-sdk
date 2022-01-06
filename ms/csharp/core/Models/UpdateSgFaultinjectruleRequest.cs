// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class UpdateSgFaultinjectruleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 故障注入规则配置（json串）
        [NameInMap("rule_config")]
        [Validation(Required=true)]
        public string RuleConfig { get; set; }

        // 规则名称
        [NameInMap("rule_name")]
        [Validation(Required=true)]
        public string RuleName { get; set; }

        // dataId
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

    }

}
