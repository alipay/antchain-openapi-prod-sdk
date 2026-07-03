// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 租期信息
    public class RentBillItem : TeaModel {
        // 租约分期ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("bill_item_id")]
        [Validation(Required=true)]
        public string BillItemId { get; set; }

        // 租约分期名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>第几期</para>
        /// </summary>
        [NameInMap("bill_item_name")]
        [Validation(Required=false)]
        public string BillItemName { get; set; }

        // 租期开始日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2006-01-02 15:04:05</para>
        /// </summary>
        [NameInMap("bill_item_begin")]
        [Validation(Required=true)]
        public string BillItemBegin { get; set; }

        // 租期结束日期 
        /// <summary>
        /// <b>Example:</b>
        /// <para>2006-02-02 15:04:05</para>
        /// </summary>
        [NameInMap("bill_item_end")]
        [Validation(Required=true)]
        public string BillItemEnd { get; set; }

        // 租约金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>5000</para>
        /// </summary>
        [NameInMap("bill_item_money")]
        [Validation(Required=true)]
        public string BillItemMoney { get; set; }

        // 租约支付状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>待支付，已支付，支付失败</para>
        /// </summary>
        [NameInMap("payment_state")]
        [Validation(Required=false)]
        public string PaymentState { get; set; }

    }

}
