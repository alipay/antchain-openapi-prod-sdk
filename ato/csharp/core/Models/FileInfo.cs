// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 文件信息
    public class FileInfo : TeaModel {
        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件key
        [NameInMap("file_key")]
        [Validation(Required=true)]
        public string FileKey { get; set; }

    }

}
