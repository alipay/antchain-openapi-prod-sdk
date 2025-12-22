// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 签署子任务完成的文件里表
    public class AntSignFileResult : TeaModel {
        // fileName	文件名称
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
