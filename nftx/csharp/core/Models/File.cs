// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    // nft发行的文件
    public class File : TeaModel {
        // 文件的可访问路径
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 文件名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // IMAGE("IMAGE","图片"),
        // VIDEO("VIDEO","视频"),
        // ;
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
