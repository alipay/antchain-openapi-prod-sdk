// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户资金
    public class UserFundInfo : TeaModel {
        // 业务订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 关联交易单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 订单支付金额，单位：元
        /// <summary>
        /// <b>Example:</b>
        /// <para>199.68</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 金额明细
        [NameInMap("details")]
        [Validation(Required=true)]
        public List<FundItemDetail> Details { get; set; }

    }

}
