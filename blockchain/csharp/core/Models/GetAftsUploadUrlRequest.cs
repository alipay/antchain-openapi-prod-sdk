// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 获取Afts上传地址和token
    public class GetAftsUploadUrlRequest : TeaModel {
        // 问件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

    }

}
