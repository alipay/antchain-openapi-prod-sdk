// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class BatchqueryTradecoreSoldspecinstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 商业中台用来唯一标记商户的id
        // merchant_id 与 merchant_login_main_id至少填一个
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商户(买家)登录主账号
        // merchant_id 与 merchant_login_main_id至少填一个
        [NameInMap("merchant_login_main_id")]
        [Validation(Required=false)]
        public string MerchantLoginMainId { get; set; }

    }

}
