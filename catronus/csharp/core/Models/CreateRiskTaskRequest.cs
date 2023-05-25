// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class CreateRiskTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 风险任务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 风险来源，image/benchmark/runtime
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 风险唯一标识
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 风险等级
        [NameInMap("priority")]
        [Validation(Required=false)]
        public string Priority { get; set; }

        // 风险任务显示名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 响应阶段，默认是日常阶段
        [NameInMap("respond_phase")]
        [Validation(Required=false)]
        public string RespondPhase { get; set; }

        // 风险责任人
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // 安全责任人
        [NameInMap("sec_owner")]
        [Validation(Required=true)]
        public string SecOwner { get; set; }

        // 风险关注者
        [NameInMap("followers")]
        [Validation(Required=true)]
        public List<string> Followers { get; set; }

        // 到期时间
        [NameInMap("deadline_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeadlineTime { get; set; }

        // 环境标识ID
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

    }

}
