// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class SignAgreementAppRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 隐私协议号
        [NameInMap("privacy_agreement_no")]
        [Validation(Required=false)]
        public string PrivacyAgreementNo { get; set; }

        // 用户协议号
        [NameInMap("user_agreement_no")]
        [Validation(Required=false)]
        public string UserAgreementNo { get; set; }

        // 小程序用户openId
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 签署时间
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public string SignTime { get; set; }

    }

}
