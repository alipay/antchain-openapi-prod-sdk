// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 一级标签信息
    public class LabelModel : TeaModel {
        // 一级标签
        [NameInMap("label")]
        [Validation(Required=false)]
        public string Label { get; set; }

        // 子标签
        [NameInMap("sub_labels")]
        [Validation(Required=false)]
        public List<SubLabelModel> SubLabels { get; set; }

    }

}
