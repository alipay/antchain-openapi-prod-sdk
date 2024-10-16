// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 二维码详情
    public class QRCodeDetail : TeaModel {
        // 位置，Top、Left、Width、Height
        [NameInMap("location")]
        [Validation(Required=true)]
        public List<long?> Location { get; set; }

        // 二维码类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 二维码内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 置信度
        [NameInMap("probability")]
        [Validation(Required=true)]
        public string Probability { get; set; }

    }

}
