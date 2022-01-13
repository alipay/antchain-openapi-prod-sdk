// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACCOUNT.Models
{
    // 充值记录VO
    public class ChargeRecordVO : TeaModel {
        // 充值凭证号
        [NameInMap("voucher_no")]
        [Validation(Required=true)]
        public string VoucherNo { get; set; }

        // 外部单据号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 充值时间
        [NameInMap("recharge_time")]
        [Validation(Required=true)]
        public string RechargeTime { get; set; }

        // 支付状态（INIT-创建订单/SUCCESS-充值成功/FAIL-充值失败）
        [NameInMap("recharge_status")]
        [Validation(Required=true)]
        public string RechargeStatus { get; set; }

        // 金额
        [NameInMap("multi_currency_money_open_api")]
        [Validation(Required=true)]
        public MultiCurrencyMoneyOpenApi MultiCurrencyMoneyOpenApi { get; set; }

    }

}
