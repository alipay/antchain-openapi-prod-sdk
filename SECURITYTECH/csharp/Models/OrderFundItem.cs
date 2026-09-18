// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 订单资金明细
    public class OrderFundItem : TeaModel {
        // order_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>METL202004041220123456</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // trade_no
        /// <summary>
        /// <b>Example:</b>
        /// <para>METL202004041220123456</para>
        /// </summary>
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // amount
        /// <summary>
        /// <b>Example:</b>
        /// <para>300.00</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 详细
        [NameInMap("details")]
        [Validation(Required=true)]
        public List<FundItem> Details { get; set; }

    }

}
