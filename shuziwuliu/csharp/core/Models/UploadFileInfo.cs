// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 包含文件id、文件hash信息
    public class UploadFileInfo : TeaModel {
        // 文件id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 文件hash
        [NameInMap("file_hash")]
        [Validation(Required=true)]
        public string FileHash { get; set; }

    }

}
