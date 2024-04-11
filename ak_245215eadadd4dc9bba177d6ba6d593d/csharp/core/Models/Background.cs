// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 背景设置
    // 
    public class Background : TeaModel {
        // 背景元素，支持 gif png jpg mp4等格式
        [NameInMap("src_url")]
        [Validation(Required=true)]
        public string SrcUrl { get; set; }

        // 背景缩放比例
        [NameInMap("scale")]
        [Validation(Required=true)]
        public string Scale { get; set; }

        // 背景图片x坐标位置，距左侧
        [NameInMap("x")]
        [Validation(Required=true)]
        public long? X { get; set; }

        // 背景图片y坐标位置，距上侧
        [NameInMap("y")]
        [Validation(Required=true)]
        public long? Y { get; set; }

    }

}
