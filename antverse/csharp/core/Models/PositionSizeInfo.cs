// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ANTVERSE.Models
{
    // 数字人位置大小信息，以左上角为起始坐标，向右向下为正值
    public class PositionSizeInfo : TeaModel {
        // 数字人x轴（竖轴）坐标
        [NameInMap("x")]
        [Validation(Required=true)]
        public long? X { get; set; }

        // 数字人y轴（横轴）坐标
        [NameInMap("y")]
        [Validation(Required=true)]
        public long? Y { get; set; }

        // 数字人宽度
        // 
        [NameInMap("width")]
        [Validation(Required=true)]
        public long? Width { get; set; }

        // 数字人高度
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

    }

}
