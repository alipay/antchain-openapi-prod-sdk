// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 资产订单信息
    public class AssetPackageOrderInfo : TeaModel {
        // 订单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 出包原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("out_reason")]
        [Validation(Required=false)]
        public string OutReason { get; set; }

        // 订单用信额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("order_credit_line")]
        [Validation(Required=false)]
        public long? OrderCreditLine { get; set; }

        // 商户应还款金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("order_merchant_repayment_money")]
        [Validation(Required=false)]
        public long? OrderMerchantRepaymentMoney { get; set; }

        // 订单分账起始账期
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("divide_start_term_index")]
        [Validation(Required=false)]
        public long? DivideStartTermIndex { get; set; }

    }

}
