// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BILLING.Models
{
    public class ChargeAccountBalanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // "10.11"代表10.11元,最小粒度到分，小数点后2位
        [NameInMap("charge_amt")]
        [Validation(Required=true)]
        public string ChargeAmt { get; set; }

        // 币种,支付宝体系内一般存储币种值（156/840/...），156代表人民币
        [NameInMap("currency_value")]
        [Validation(Required=true)]
        public string CurrencyValue { get; set; }

        // 渠道来源： ANTCLOUD_OFFICIAL 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台
        [NameInMap("from_channel")]
        [Validation(Required=true)]
        public string FromChannel { get; set; }

        // 唤起收银台后，充值后回调url链接
        [NameInMap("return_url")]
        [Validation(Required=true)]
        public string ReturnUrl { get; set; }

    }

}
