// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    public class SyncAntchainAtoFundSplittingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方订单号
        [NameInMap("fund_no")]
        [Validation(Required=true, MaxLength=50)]
        public string FundNo { get; set; }

        // 商户的订单号
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 商户的数科租户ID
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=50)]
        public string MerchantTenantId { get; set; }

        // 第几期，例如：2表示第二期
        [NameInMap("term_num")]
        [Validation(Required=true)]
        public long? TermNum { get; set; }

        // 扣款时间， yyyy-MM-dd HH:mm:ss 格式
        [NameInMap("deduction_time")]
        [Validation(Required=true)]
        public string DeductionTime { get; set; }

        // 扣款金额，单位精确到分， 例如：12462300为124623.00元
        [NameInMap("deduction_amount")]
        [Validation(Required=true)]
        public long? DeductionAmount { get; set; }

        // 商户分账金额，单位精确到分，比如：666601 = 6666.01元
        [NameInMap("merchant_split_amount")]
        [Validation(Required=true)]
        public long? MerchantSplitAmount { get; set; }

        // 资方分账金额，单位精确到分。比如：666610 = 6666.10元
        [NameInMap("fund_split_amount")]
        [Validation(Required=true)]
        public long? FundSplitAmount { get; set; }

        // 其他参与方分账信息，JSON格式的数组，样例：
        // [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
        [NameInMap("other_split_info")]
        [Validation(Required=false)]
        public string OtherSplitInfo { get; set; }

    }

}
