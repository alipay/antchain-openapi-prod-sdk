// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class InitIdentificationFaceauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 认证人的姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 被验证者的身份证号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 授权码，针对某些特定场景使用，非必填
        [NameInMap("auth_code")]
        [Validation(Required=false)]
        public string AuthCode { get; set; }

    }

}
