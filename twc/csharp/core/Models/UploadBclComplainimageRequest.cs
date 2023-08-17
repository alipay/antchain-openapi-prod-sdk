// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UploadBclComplainimageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 图片格式，支持格式：jpg、jpeg、png
        [NameInMap("image_name")]
        [Validation(Required=true, MaxLength=64)]
        public string ImageName { get; set; }

        // 图片二进制字节流
        [NameInMap("image_content")]
        [Validation(Required=true)]
        public string ImageContent { get; set; }

    }

}
