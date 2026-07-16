// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 用信订单信息
    public class CreditUtilizationOrder : TeaModel {
        // 123
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 订单用信额度，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("order_credit_line")]
        [Validation(Required=true)]
        public long? OrderCreditLine { get; set; }

        // 订单商户应还金额，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("order_merchant_repayment_money")]
        [Validation(Required=true)]
        public long? OrderMerchantRepaymentMoney { get; set; }

        // 分账起始日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("divide_start_term_index")]
        [Validation(Required=true)]
        public long? DivideStartTermIndex { get; set; }

    }

}
