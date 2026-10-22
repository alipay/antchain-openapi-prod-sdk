// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QueryMeiyouAuditresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审核ID
        [NameInMap("audit_ids")]
        [Validation(Required=false)]
        public List<long?> AuditIds { get; set; }

        // 美柚任务审核结果推送状态
        [NameInMap("meiyou_audit_state")]
        [Validation(Required=false)]
        public string MeiyouAuditState { get; set; }

        // 审核记录状态
        [NameInMap("audit_state")]
        [Validation(Required=false)]
        public List<string> AuditState { get; set; }

        // 主题记录状态
        [NameInMap("topic_state")]
        [Validation(Required=false)]
        public string TopicState { get; set; }

        // 开始时间点
        [NameInMap("create_start")]
        [Validation(Required=false)]
        public string CreateStart { get; set; }

        // 结束时间点
        [NameInMap("create_end")]
        [Validation(Required=false)]
        public string CreateEnd { get; set; }

        // 数据来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}
