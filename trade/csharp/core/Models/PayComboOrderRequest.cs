// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class PayComboOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 套餐订单号
        [NameInMap("combo_order_id")]
        [Validation(Required=true)]
        public string ComboOrderId { get; set; }

        // 支付渠道，客资：FINANCIAL_FUND；财资：CUSTOMER_FUND；支付通：ALIPAY
        [NameInMap("pay_channel")]
        [Validation(Required=true)]
        public string PayChannel { get; set; }

        // 支付模式，PAGE：页面确认支付；AUTO：系统自动扣款
        // 支付通模式只支持PAGE
        [NameInMap("pay_mode")]
        [Validation(Required=true)]
        public string PayMode { get; set; }

        // 支付回跳地址，当pay_mode=PAGE时，必传
        [NameInMap("pay_return_url")]
        [Validation(Required=false)]
        public string PayReturnUrl { get; set; }

    }

}
