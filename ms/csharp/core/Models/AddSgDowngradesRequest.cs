// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddSgDowngradesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 处理动作 (返回为空 返回错误)
        [NameInMap("strategy")]
        [Validation(Required=true)]
        public string Strategy { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 降级方法
        [NameInMap("downgrade_method")]
        [Validation(Required=true)]
        public string DowngradeMethod { get; set; }

        // 降级服务
        [NameInMap("downgrade_service")]
        [Validation(Required=true)]
        public string DowngradeService { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 运行模式
        [NameInMap("mode")]
        [Validation(Required=true)]
        public string Mode { get; set; }

        // 规则名称
        [NameInMap("rule_name")]
        [Validation(Required=true)]
        public string RuleName { get; set; }

    }

}
