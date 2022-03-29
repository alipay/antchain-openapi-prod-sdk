// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // OpsCheckResult
    public class OpsCheckResult : TeaModel {
        // 应用名
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 实际实例数
        [NameInMap("actual_instance_num")]
        [Validation(Required=true)]
        public long? ActualInstanceNum { get; set; }

        // 预期实例数
        [NameInMap("expect_instance_num")]
        [Validation(Required=true)]
        public long? ExpectInstanceNum { get; set; }

        // 应用监控指标健康数
        [NameInMap("app_healthy_num")]
        [Validation(Required=true)]
        public long? AppHealthyNum { get; set; }

        // 	
        // 应用监控指标异常数
        [NameInMap("app_unhealthy_num")]
        [Validation(Required=true)]
        public long? AppUnhealthyNum { get; set; }

        // 自定义监控指标健康数
        [NameInMap("custom_healthy_num")]
        [Validation(Required=true)]
        public long? CustomHealthyNum { get; set; }

        // 自定义监控指标异常数
        [NameInMap("custom_unhealthy_num")]
        [Validation(Required=true)]
        public long? CustomUnhealthyNum { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 规则状态 0：已关闭 1：已开启
        [NameInMap("rule_status")]
        [Validation(Required=true)]
        public long? RuleStatus { get; set; }

        // rule_id
        [NameInMap("rule_id")]
        [Validation(Required=false)]
        public string RuleId { get; set; }

    }

}
