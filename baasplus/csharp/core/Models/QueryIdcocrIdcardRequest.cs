// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryIdcocrIdcardRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 身份证图片base64编码内容
        [NameInMap("image_content")]
        [Validation(Required=true)]
        public string ImageContent { get; set; }

        // face: 身份证正面
        // back: 身份证反面
        [NameInMap("side")]
        [Validation(Required=true)]
        public string Side { get; set; }

    }

}
