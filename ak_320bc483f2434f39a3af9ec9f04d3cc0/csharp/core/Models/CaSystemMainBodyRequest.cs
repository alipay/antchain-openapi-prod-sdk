// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // CA电子签约正文章信息
    public class CaSystemMainBodyRequest : TeaModel {
        // 签署页码
        [NameInMap("pos_page")]
        [Validation(Required=true)]
        public long? PosPage { get; set; }

        // 签署区位置横坐标
        [NameInMap("pos_x")]
        [Validation(Required=true)]
        public long? PosX { get; set; }

        // 签署区位置纵坐标
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public long? PosY { get; set; }

    }

}
