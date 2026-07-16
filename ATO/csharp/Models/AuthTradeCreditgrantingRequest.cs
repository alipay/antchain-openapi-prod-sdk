// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class AuthTradeCreditgrantingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // merchant_id
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=64)]
        public string MerchantId { get; set; }

        // fund_id
        [NameInMap("fund_id")]
        [Validation(Required=true, MaxLength=64)]
        public string FundId { get; set; }

        // auth_id
        [NameInMap("auth_id")]
        [Validation(Required=true, MaxLength=20)]
        public string AuthId { get; set; }

        // apply_role
        [NameInMap("apply_role")]
        [Validation(Required=true, MaxLength=32)]
        public string ApplyRole { get; set; }

        // auth_sign_type
        [NameInMap("auth_sign_type")]
        [Validation(Required=true, MaxLength=32)]
        public string AuthSignType { get; set; }

        // auth_begin_date
        // 授权开始时间
        // yyyy-MM-dd HH:mm:ss
        // 非空，不可早于当前时间
        // 为空，设置为当前时间
        [NameInMap("auth_begin_date")]
        [Validation(Required=false)]
        public string AuthBeginDate { get; set; }

        // 授权结束时间
        // yyyy-MM-dd HH:mm:ss
        // 非空，不可早于authBeginDate
        [NameInMap("auth_end_date")]
        [Validation(Required=false)]
        public string AuthEndDate { get; set; }

    }

}
