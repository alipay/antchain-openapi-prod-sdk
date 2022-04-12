// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    // 文件集合
    public class UploadRequestArray : TeaModel {
        // 文件数据
        [NameInMap("upload_array")]
        [Validation(Required=true)]
        public UploadRequest UploadArray { get; set; }

    }

}
