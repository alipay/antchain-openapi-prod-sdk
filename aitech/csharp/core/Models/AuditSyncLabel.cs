// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 审核同步标签列表
    public class AuditSyncLabel : TeaModel {
        // 标签名：sex-色情
        [NameInMap("label")]
        [Validation(Required=true)]
        public string Label { get; set; }

        // 检测到单个风险标签的置信度：66.25
        [NameInMap("probability")]
        [Validation(Required=true)]
        public long? Probability { get; set; }

        // 风险标签说明
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 检测到的敏感词，多个词用逗号分隔，部分标签不会返回敏感词：AA,BB,CC
        [NameInMap("risk_words")]
        [Validation(Required=true)]
        public string RiskWords { get; set; }

    }

}
