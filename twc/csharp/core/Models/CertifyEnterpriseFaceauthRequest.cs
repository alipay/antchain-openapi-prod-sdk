// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CertifyEnterpriseFaceauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务唯一性标识
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 回调通知地址
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        // 认证完成后回跳地址
        [NameInMap("redirect_url")]
        [Validation(Required=false)]
        public string RedirectUrl { get; set; }

    }

}
