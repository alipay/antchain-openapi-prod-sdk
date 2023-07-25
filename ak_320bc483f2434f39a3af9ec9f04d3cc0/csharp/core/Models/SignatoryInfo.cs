// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署方信息
    public class SignatoryInfo : TeaModel {
        // 页码信息 （骑缝签署页码为1-2这种，其余情况都是数字）
        [NameInMap("pos_page")]
        [Validation(Required=true)]
        public string PosPage { get; set; }

        //  x坐标
        [NameInMap("pos_x")]
        [Validation(Required=true)]
        public string PosX { get; set; }

        //  y坐标
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public string PosY { get; set; }

        // 签署区宽 (默认为100)
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

    }

}
