// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 降级规则Vo
    public class DowngradeRuleVo : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 降级规则组id
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public long? GroupId { get; set; }

        // 降级服务
        [NameInMap("downgrade_service")]
        [Validation(Required=true)]
        public string DowngradeService { get; set; }

        // 降级方法
        [NameInMap("downgrade_method")]
        [Validation(Required=true)]
        public string DowngradeMethod { get; set; }

        // 规则描述
        [NameInMap("rule_name")]
        [Validation(Required=true)]
        public string RuleName { get; set; }

        // 降级开关(0: 关闭 1: 开启) 
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public long? Enabled { get; set; }

        // 运行模式
        [NameInMap("mode")]
        [Validation(Required=true)]
        public string Mode { get; set; }

        // 降级行为
        [NameInMap("downgrade_action")]
        [Validation(Required=true)]
        public string DowngradeAction { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
