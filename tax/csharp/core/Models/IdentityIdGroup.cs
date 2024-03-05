// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 税号批次清单
    public class IdentityIdGroup : TeaModel {
        // 数据源
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 上传的文件
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

    }

}
