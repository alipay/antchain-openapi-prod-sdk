// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署完成的文件
    public class CaSignFileResult : TeaModel {
        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 文件osskey
        [NameInMap("file_key")]
        [Validation(Required=false)]
        public string FileKey { get; set; }

        // 文件id
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 文件http链接
        [NameInMap("http_file_url")]
        [Validation(Required=false)]
        public string HttpFileUrl { get; set; }

    }

}
