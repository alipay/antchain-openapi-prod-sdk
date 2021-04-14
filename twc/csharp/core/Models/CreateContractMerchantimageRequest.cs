// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractMerchantimageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 图片内容，base64
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 图片名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

    }

}
