// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 骑缝章信息
    public class CaSystemCrossPageRequest : TeaModel {
        // 签署页码
        [NameInMap("pos_page_start")]
        [Validation(Required=true)]
        public long? PosPageStart { get; set; }

        // 结束页码（供骑缝章使用）
        [NameInMap("pos_page_end")]
        [Validation(Required=true)]
        public long? PosPageEnd { get; set; }

        // 签署区位置横坐标
        [NameInMap("pos_x")]
        [Validation(Required=true)]
        public string PosX { get; set; }

        // 签署区位置纵坐标
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public string PosY { get; set; }

    }

}
