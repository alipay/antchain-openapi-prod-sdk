// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单还款策略
    public class OrderRepayStrategy : TeaModel {
        // 还款期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("term_index")]
        [Validation(Required=false)]
        public long? TermIndex { get; set; }

        // 每期应还租金(分)
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000</para>
        /// </summary>
        [NameInMap("rental_money")]
        [Validation(Required=false)]
        public long? RentalMoney { get; set; }

        // 每期应付时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-21</para>
        /// </summary>
        [NameInMap("pay_day")]
        [Validation(Required=false)]
        public string PayDay { get; set; }

        // 付款项目列表
        [NameInMap("payment_item_list")]
        [Validation(Required=false)]
        public List<PaymentItem> PaymentItemList { get; set; }

        // 是否无需履约
        /// <summary>
        /// <b>Example:</b>
        /// <para>Y</para>
        /// </summary>
        [NameInMap("no_performance")]
        [Validation(Required=false)]
        public string NoPerformance { get; set; }

    }

}
