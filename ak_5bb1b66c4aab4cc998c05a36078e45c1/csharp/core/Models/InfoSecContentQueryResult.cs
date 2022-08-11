// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    // 大安全接口返回
    public class InfoSecContentQueryResult : TeaModel {
        // 检测来源等级
        [NameInMap("detect_resource_level")]
        [Validation(Required=false)]
        public string DetectResourceLevel { get; set; }

        // 检测结果类型
        [NameInMap("detect_type_code")]
        [Validation(Required=false)]
        public string DetectTypeCode { get; set; }

        // 命中内容
        [NameInMap("hit_content")]
        [Validation(Required=false)]
        public string HitContent { get; set; }

        // 检测命中来源
        [NameInMap("hit_detect_resource")]
        [Validation(Required=false)]
        public string HitDetectResource { get; set; }

    }

}
