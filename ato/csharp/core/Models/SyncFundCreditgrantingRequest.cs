// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncFundCreditgrantingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授信id
        [NameInMap("granting_id")]
        [Validation(Required=true, MaxLength=20)]
        public string GrantingId { get; set; }

        // 授信授权id
        [NameInMap("auth_id")]
        [Validation(Required=true, MaxLength=20)]
        public string AuthId { get; set; }

        // 资方社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true, MaxLength=32)]
        public string FundId { get; set; }

        // 商户社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=32)]
        public string MerchantId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true, MaxLength=32)]
        public string TenantId { get; set; }

        // 授权额度，单位为分
        [NameInMap("granting_line")]
        [Validation(Required=true)]
        public long? GrantingLine { get; set; }

        // 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
        [NameInMap("effect_start_time")]
        [Validation(Required=true, MaxLength=20)]
        public string EffectStartTime { get; set; }

        // 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
        [NameInMap("effect_end_time")]
        [Validation(Required=true, MaxLength=20)]
        public string EffectEndTime { get; set; }

    }

}
