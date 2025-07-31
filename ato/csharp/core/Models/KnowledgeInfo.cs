// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智能体二期-知识点信息
    public class KnowledgeInfo : TeaModel {
        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 主键id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 问题
        [NameInMap("question")]
        [Validation(Required=false)]
        public string Question { get; set; }

        // 答案
        [NameInMap("answer")]
        [Validation(Required=false)]
        public string Answer { get; set; }

        // 是否选择订单
        [NameInMap("has_order")]
        [Validation(Required=false)]
        public bool? HasOrder { get; set; }

        // 是否带小程序链接
        [NameInMap("has_app_link")]
        [Validation(Required=false)]
        public bool? HasAppLink { get; set; }

        // 是否转人工
        [NameInMap("has_manual")]
        [Validation(Required=false)]
        public bool? HasManual { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 驳回原因
        [NameInMap("refuse_reason")]
        [Validation(Required=false)]
        public string RefuseReason { get; set; }

    }

}
