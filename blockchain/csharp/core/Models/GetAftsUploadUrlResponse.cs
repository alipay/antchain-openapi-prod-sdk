// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 获取Afts文件上传地址返回值，包含地址和token
    public class GetAftsUploadUrlResponse : TeaModel {
        // 11121312
        [NameInMap("mass_token")]
        [Validation(Required=true)]
        public string MassToken { get; set; }

        // 上传文件地址
        [NameInMap("upload_url")]
        [Validation(Required=true)]
        public string UploadUrl { get; set; }

    }

}
