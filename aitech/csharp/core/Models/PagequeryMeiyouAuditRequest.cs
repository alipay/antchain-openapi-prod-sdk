// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class PagequeryMeiyouAuditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主键id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 页面
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 审核记录ID
        [NameInMap("audit_id")]
        [Validation(Required=false)]
        public long? AuditId { get; set; }

        // 大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 主题ID
        [NameInMap("topic_id")]
        [Validation(Required=false)]
        public long? TopicId { get; set; }

        // 内容文本
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 一级业务
        [NameInMap("primary_business")]
        [Validation(Required=false)]
        public string PrimaryBusiness { get; set; }

        // 二级业务
        [NameInMap("secondary_business")]
        [Validation(Required=false)]
        public string SecondaryBusiness { get; set; }

        // 审核结果
        [NameInMap("audit_result")]
        [Validation(Required=false)]
        public string AuditResult { get; set; }

        // 审核原因
        [NameInMap("audit_reason")]
        [Validation(Required=false)]
        public string AuditReason { get; set; }

        // 创建时间-start
        [NameInMap("gmt_create_start")]
        [Validation(Required=false)]
        public string GmtCreateStart { get; set; }

        // 创建时间-end
        [NameInMap("gmt_create_end")]
        [Validation(Required=false)]
        public string GmtCreateEnd { get; set; }

        // 数据来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}
