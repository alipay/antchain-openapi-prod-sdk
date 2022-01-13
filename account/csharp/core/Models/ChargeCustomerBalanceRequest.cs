// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACCOUNT.Models
{
    public class ChargeCustomerBalanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 充值金额，单位分
        [NameInMap("recharge_amt")]
        [Validation(Required=true)]
        public string RechargeAmt { get; set; }

        // 币种
        [NameInMap("currency_value")]
        [Validation(Required=true)]
        public string CurrencyValue { get; set; }

        // 用户充值后跳转的地址链接，若不填，则默认跳到中台费用中心页面
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // 调用系统appName
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 充值渠道，默认传"01"
        [NameInMap("recharge_channel")]
        [Validation(Required=true)]
        public string RechargeChannel { get; set; }

        // 外部单据号，用于幂等
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

    }

}
