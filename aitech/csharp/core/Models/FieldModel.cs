// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 领域信息
    public class FieldModel : TeaModel {
        // 领域一级标签
        [NameInMap("field_category")]
        [Validation(Required=false)]
        public string FieldCategory { get; set; }

        // 领域二级标签
        [NameInMap("field_label")]
        [Validation(Required=false)]
        public string FieldLabel { get; set; }

        // 领域一级标签的等级分数
        [NameInMap("field_score")]
        [Validation(Required=false)]
        public long? FieldScore { get; set; }

    }

}
