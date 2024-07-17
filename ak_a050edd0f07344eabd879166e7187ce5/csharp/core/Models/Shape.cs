// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 前端图形相关
    public class Shape : TeaModel {
        // 边的样式
        [NameInMap("shape")]
        [Validation(Required=true)]
        public string Shape_ { get; set; }

        // edgeId
        [NameInMap("edge_id")]
        [Validation(Required=true)]
        public string EdgeId { get; set; }

        // 边起点的锚点位置
        [NameInMap("source_anchor")]
        [Validation(Required=true)]
        public long? SourceAnchor { get; set; }

        // 边终点的锚点位置
        [NameInMap("target_anchor")]
        [Validation(Required=true)]
        public long? TargetAnchor { get; set; }

    }

}
