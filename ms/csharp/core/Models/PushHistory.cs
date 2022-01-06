// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 推送历史
    public class PushHistory : TeaModel {
        // app name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 创建
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 推送历史id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 编辑人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 推送内容
        // 
        // 
        // 
        // 
        [NameInMap("push_content")]
        [Validation(Required=false)]
        public string PushContent { get; set; }

        // 逗号分隔的ruleId
        [NameInMap("rule_ids")]
        [Validation(Required=false)]
        public string RuleIds { get; set; }

        // 是否成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 推送目标
        [NameInMap("target")]
        [Validation(Required=false)]
        public string Target { get; set; }

    }

}
