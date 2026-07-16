// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class ApplyTradeCreditgrantingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授信id
        [NameInMap("granting_id")]
        [Validation(Required=true, MaxLength=49)]
        public string GrantingId { get; set; }

        // merchant_id
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=63)]
        public string MerchantId { get; set; }

        // merchant_name
        [NameInMap("merchant_name")]
        [Validation(Required=true, MaxLength=199)]
        public string MerchantName { get; set; }

        // fund_id
        [NameInMap("fund_id")]
        [Validation(Required=true, MaxLength=63)]
        public string FundId { get; set; }

        // auth_id
        [NameInMap("auth_id")]
        [Validation(Required=true, MaxLength=63)]
        public string AuthId { get; set; }

        // 授信附加信息
        [NameInMap("credit_extra_data")]
        [Validation(Required=false)]
        public string CreditExtraData { get; set; }

    }

}
