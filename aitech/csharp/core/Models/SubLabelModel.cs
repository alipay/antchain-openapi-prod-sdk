// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 二级标签结构
    public class SubLabelModel : TeaModel {
        // 二级标签
        [NameInMap("sub_label")]
        [Validation(Required=true)]
        public string SubLabel { get; set; }

        // 风险关键词列表
        [NameInMap("risk_words")]
        [Validation(Required=false)]
        public List<string> RiskWords { get; set; }

        // 风险关键词索引列表
        [NameInMap("risk_words_index")]
        [Validation(Required=false)]
        public List<string> RiskWordsIndex { get; set; }

        // 三级标签列表
        [NameInMap("third_labels")]
        [Validation(Required=false)]
        public List<string> ThirdLabels { get; set; }

    }

}
