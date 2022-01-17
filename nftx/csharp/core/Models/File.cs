// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    // nft发行的文件
    public class File : TeaModel {
        // 原文件的可访问路径
        [NameInMap("original_file_path")]
        [Validation(Required=true)]
        public string OriginalFilePath { get; set; }

        // 缩略图的可访问路径
        [NameInMap("mini_image_path")]
        [Validation(Required=true)]
        public string MiniImagePath { get; set; }

        // 文件名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        //     IMAGE("IMAGE", "图片"),
        //     VIDEO("VIDEO", "视频"),
        //     AUDIO("AUDIO","音频"),
        //     THREE_DIMENSIONS("THREE_DIMENSIONS","3D模型")
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
