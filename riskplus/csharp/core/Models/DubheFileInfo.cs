// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢文件信息统一结构体
    public class DubheFileInfo : TeaModel {
        // 文件访问路径
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

    }

}
