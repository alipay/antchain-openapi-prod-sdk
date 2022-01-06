// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddSgTrafficmirrorruleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 源应用
        [NameInMap("source_app")]
        [Validation(Required=true)]
        public string SourceApp { get; set; }

        // 源服务
        [NameInMap("source_data_id")]
        [Validation(Required=true)]
        public string SourceDataId { get; set; }

        // demo_mirror
        [NameInMap("target_app")]
        [Validation(Required=true)]
        public string TargetApp { get; set; }

        // 目标服务id
        [NameInMap("target_data_id")]
        [Validation(Required=true)]
        public string TargetDataId { get; set; }

        // 规则名
        [NameInMap("rule_name")]
        [Validation(Required=true)]
        public string RuleName { get; set; }

        // 规则配置（json字符串）
        [NameInMap("rule_config")]
        [Validation(Required=true)]
        public string RuleConfig { get; set; }

    }

}
