// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 流量镜像视图对象
    public class TrafficMirrorRuleVO : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 源应用
        [NameInMap("source_app")]
        [Validation(Required=false)]
        public string SourceApp { get; set; }

        // 源服务ID
        [NameInMap("source_data_id")]
        [Validation(Required=false)]
        public string SourceDataId { get; set; }

        // 目标应用
        [NameInMap("target_app")]
        [Validation(Required=false)]
        public string TargetApp { get; set; }

        // 目标服务ID
        [NameInMap("target_data_id")]
        [Validation(Required=false)]
        public string TargetDataId { get; set; }

        // 规则名
        [NameInMap("rule_name")]
        [Validation(Required=false)]
        public string RuleName { get; set; }

        // 是否开启
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public bool? Enabled { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 规则配置
        [NameInMap("rule_config")]
        [Validation(Required=false)]
        public TrafficMirrorConfigModel RuleConfig { get; set; }

    }

}
