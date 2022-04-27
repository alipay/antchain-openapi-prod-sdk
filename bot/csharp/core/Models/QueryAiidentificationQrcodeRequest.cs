// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryAiidentificationQrcodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户身份标识
        [NameInMap("app_key")]
        [Validation(Required=true)]
        public string AppKey { get; set; }

        // 图片内容的base64字符串
        [NameInMap("query_image_base64")]
        [Validation(Required=true)]
        public string QueryImageBase64 { get; set; }

        // 底图内容的base64字符串
        [NameInMap("gallery_image_base64")]
        [Validation(Required=true)]
        public string GalleryImageBase64 { get; set; }

    }

}
