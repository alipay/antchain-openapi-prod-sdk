// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetPrivatecontractSignurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 私有云实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 签署流程ID
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 签署用户的内部ID
        [NameInMap("user_inner_id")]
        [Validation(Required=true)]
        public string UserInnerId { get; set; }

        // 签署平台，默认为H5页面，浏览器打开；也可填写ALIPAY，使用支付宝小程序打开
        [NameInMap("sign_platform")]
        [Validation(Required=false)]
        public string SignPlatform { get; set; }

        // 签署流程过期时间
        [NameInMap("expiration_time")]
        [Validation(Required=true)]
        public long? ExpirationTime { get; set; }

    }

}
