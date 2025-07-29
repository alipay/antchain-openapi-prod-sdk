// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 卡证OCR图片坐标
    public class OcrLocation : TeaModel {
        // 表示定位位置的长方形左上顶点的垂直坐标
        [NameInMap("top")]
        [Validation(Required=false)]
        public string Top { get; set; }

        // 表示定位位置的长方形左上顶点的水平坐标
        [NameInMap("left")]
        [Validation(Required=false)]
        public string Left { get; set; }

        // 表示定位位置的长方形的宽度
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // 表示定位位置的长方形的高度
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

    }

}
