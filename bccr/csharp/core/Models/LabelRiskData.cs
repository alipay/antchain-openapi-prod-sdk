// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 作品标签识别结果
    public class LabelRiskData : TeaModel {
        // 识别出的标签名称
        [NameInMap("label_name")]
        [Validation(Required=true)]
        public string LabelName { get; set; }

        // 识别出的标签是否与用户选择的标签匹配
        [NameInMap("is_match")]
        [Validation(Required=true)]
        public bool? IsMatch { get; set; }

        // 识别出的标签匹配度
        [NameInMap("match_value")]
        [Validation(Required=true)]
        public string MatchValue { get; set; }

    }

}
