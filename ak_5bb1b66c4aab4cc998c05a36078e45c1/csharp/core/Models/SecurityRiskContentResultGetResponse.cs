// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    // 内容检测接口查询返回结构
    public class SecurityRiskContentResultGetResponse : TeaModel {
        // 命中次数
        [NameInMap("hit_detect_items")]
        [Validation(Required=false)]
        public List<InfoSecHitDetectItem> HitDetectItems { get; set; }

        // 返回结果
        [NameInMap("result_action")]
        [Validation(Required=false)]
        public string ResultAction { get; set; }

    }

}
