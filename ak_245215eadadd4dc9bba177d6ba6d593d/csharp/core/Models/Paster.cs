// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 视频贴片信息
    public class Paster : TeaModel {
        //  贴片元素离画面位置x坐标
        [NameInMap("x")]
        [Validation(Required=true)]
        public long? X { get; set; }

        //  贴片元素离画面位置y坐标
        [NameInMap("y")]
        [Validation(Required=true)]
        public long? Y { get; set; }

        //  贴片元素 url,支持 gif png jpg等图片格式
        [NameInMap("src_url")]
        [Validation(Required=true)]
        public string SrcUrl { get; set; }

        // 贴片元素缩放比例
        [NameInMap("scale")]
        [Validation(Required=true)]
        public string Scale { get; set; }

    }

}
