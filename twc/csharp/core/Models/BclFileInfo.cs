// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 文件信息
    public class BclFileInfo : TeaModel {
        // 文件名称 包含后缀
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件下载链接
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

    }

}
