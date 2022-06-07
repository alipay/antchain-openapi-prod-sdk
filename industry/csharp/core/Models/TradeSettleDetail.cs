// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    // 交易结算明细
    public class TradeSettleDetail : TeaModel {
        // 类型
        // replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)、settle(结算)、settle_refund(退结算)、on_settle(待结算)
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 结算明细序列号，即结算请求中的业务单据号
        [NameInMap("serial_no")]
        [Validation(Required=true)]
        public string SerialNo { get; set; }

        // 转入账户
        [NameInMap("trans_in")]
        [Validation(Required=false)]
        public string TransIn { get; set; }

        // 转出账号
        [NameInMap("trans_out")]
        [Validation(Required=true)]
        public string TransOut { get; set; }

        // 金额，元，最小支持到分
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

    }

}
