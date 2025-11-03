// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 更新美柚itag关系信息
    public class UpdateMeiyouItagRelationWebInfo : TeaModel {
        // 主键id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 审核记录ID
        [NameInMap("audit_id")]
        [Validation(Required=false)]
        public string AuditId { get; set; }

        // itag数据ID
        [NameInMap("itag_data_id")]
        [Validation(Required=false)]
        public long? ItagDataId { get; set; }

        // 美柚任务审核结果推送状态
        [NameInMap("meiyou_audit_state")]
        [Validation(Required=false)]
        public string MeiyouAuditState { get; set; }

        // 审核不通过原因
        [NameInMap("refuse_reson")]
        [Validation(Required=false)]
        public string RefuseReson { get; set; }

        // 美柚itag关联状态
        [NameInMap("audit_state")]
        [Validation(Required=false)]
        public string AuditState { get; set; }

        // 美柚itag关联状态
        [NameInMap("topic_state")]
        [Validation(Required=false)]
        public string TopicState { get; set; }

        // 审核结果
        [NameInMap("audit_result")]
        [Validation(Required=false)]
        public string AuditResult { get; set; }

    }

}
