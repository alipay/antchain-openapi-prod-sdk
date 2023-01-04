// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UploadContractComplainimageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 图片名称，支持后缀格式：jpg、jpeg、png
        [NameInMap("file_name")]
        [Validation(Required=true, MaxLength=32)]
        public string FileName { get; set; }

        // 图片二进制字节流
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
