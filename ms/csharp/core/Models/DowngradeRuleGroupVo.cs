// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 降级规则组Vo
    public class DowngradeRuleGroupVo : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // foo
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 降级全局开关(0:关闭 1:开启)
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public long? Enabled { get; set; }

        // 降级规则
        [NameInMap("downgrade_rules")]
        [Validation(Required=true)]
        public List<DowngradeRuleVo> DowngradeRules { get; set; }

    }

}
