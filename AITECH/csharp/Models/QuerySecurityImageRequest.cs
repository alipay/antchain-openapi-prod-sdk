// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityImageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方唯一标示
        [NameInMap("enterprise")]
        [Validation(Required=false)]
        public string Enterprise { get; set; }

        // 租户id
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 图片风险监测code
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 标示是否是同一个Q&A
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 待检测图片地址
        [NameInMap("image_url")]
        [Validation(Required=true)]
        public string ImageUrl { get; set; }

        // 图片检测内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
