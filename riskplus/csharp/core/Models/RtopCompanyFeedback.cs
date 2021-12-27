// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业反馈
    public class RtopCompanyFeedback : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 企业ID
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 反馈原因
        [NameInMap("feedback_reason")]
        [Validation(Required=true)]
        public string FeedbackReason { get; set; }

        // 反馈原因详情
        [NameInMap("feedback_reason_detail")]
        [Validation(Required=true)]
        public string FeedbackReasonDetail { get; set; }

        // 评论
        [NameInMap("comment")]
        [Validation(Required=true)]
        public string Comment { get; set; }

    }

}
