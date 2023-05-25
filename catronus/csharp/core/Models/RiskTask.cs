// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 风险任务/工单
    public class RiskTask : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 风险名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 优先级
        [NameInMap("priority")]
        [Validation(Required=true)]
        public string Priority { get; set; }

        // 当前状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 风险类型
        [NameInMap("risk_type")]
        [Validation(Required=true)]
        public string RiskType { get; set; }

        // 负责人
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // 到期时间
        [NameInMap("deadline_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeadlineTime { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 响应阶段
        [NameInMap("respond_phase")]
        [Validation(Required=true)]
        public string RespondPhase { get; set; }

        // 风险关注者
        [NameInMap("followers")]
        [Validation(Required=true)]
        public List<string> Followers { get; set; }

        // 安全工程师
        [NameInMap("sec_owner")]
        [Validation(Required=true)]
        public string SecOwner { get; set; }

        // 到期天数
        [NameInMap("days_left")]
        [Validation(Required=true)]
        public long? DaysLeft { get; set; }

        // 风险ID
        [NameInMap("risk_id")]
        [Validation(Required=true)]
        public string RiskId { get; set; }

    }

}
