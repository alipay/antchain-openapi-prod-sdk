// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 待签署文件列表
    public class CaSignFileRequest : TeaModel {
        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件id,映射唯一的文件。多文件签署场景下，fileId必须唯一且和文件一一对应
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

    }

}
