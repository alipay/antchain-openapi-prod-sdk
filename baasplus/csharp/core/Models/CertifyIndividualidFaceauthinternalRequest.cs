// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class CertifyIndividualidFaceauthinternalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 回调通知地址
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        // 认证的唯一性id
        // 
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

        // 认证完成后回跳地址
        [NameInMap("redirect_url")]
        [Validation(Required=false)]
        public string RedirectUrl { get; set; }

        // 内部字段
        [NameInMap("biz_info")]
        [Validation(Required=true)]
        public BizInfo BizInfo { get; set; }

    }

}
