// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class SignMerchantAgreementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 来源场景码, 由中台为业务方分配
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 商家pid
        [NameInMap("merchant_user_id")]
        [Validation(Required=true)]
        public string MerchantUserId { get; set; }

        // 个人签约产品码，商户代扣场景固定GENERAL_WITHHOLDING_P
        [NameInMap("personal_product_code")]
        [Validation(Required=true)]
        public string PersonalProductCode { get; set; }

    }

}
