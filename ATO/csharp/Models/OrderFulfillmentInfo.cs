// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单履约
    public class OrderFulfillmentInfo : TeaModel {
        // 租期编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("lease_term_index")]
        [Validation(Required=false)]
        public long? LeaseTermIndex { get; set; }

        // 租期归还状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>CANCEL</para>
        /// </summary>
        [NameInMap("rental_return_state")]
        [Validation(Required=false)]
        public string RentalReturnState { get; set; }

        // 实际还款金额(分)
        /// <summary>
        /// <b>Example:</b>
        /// <para>123400</para>
        /// </summary>
        [NameInMap("real_repay_money")]
        [Validation(Required=false)]
        public long? RealRepayMoney { get; set; }

        // 租金(分)
        /// <summary>
        /// <b>Example:</b>
        /// <para>273800</para>
        /// </summary>
        [NameInMap("rental_money")]
        [Validation(Required=false)]
        public long? RentalMoney { get; set; }

        // 每期实付时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-21 15:11:23.000 </para>
        /// </summary>
        [NameInMap("return_time")]
        [Validation(Required=false)]
        public string ReturnTime { get; set; }

        // 周期性代扣
        /// <summary>
        /// <b>Example:</b>
        /// <para>ANTDIGITAL</para>
        /// </summary>
        [NameInMap("return_way")]
        [Validation(Required=false)]
        public string ReturnWay { get; set; }

        // 还款流水号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("return_voucher_serial")]
        [Validation(Required=false)]
        public string ReturnVoucherSerial { get; set; }

        // 支付宝协议号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123122134</para>
        /// </summary>
        [NameInMap("alipay_trade_no")]
        [Validation(Required=false)]
        public string AlipayTradeNo { get; set; }

    }

}
