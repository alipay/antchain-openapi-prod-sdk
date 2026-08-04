// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 支付详情
    public class OrderPayInfo : TeaModel {
        // 支付状态：PROCESSING-处理中,SUCCESS-成功,CLOSE-关闭,FAILED-失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("order_pay_status")]
        [Validation(Required=true)]
        public string OrderPayStatus { get; set; }

        // 支付时间，条件返回：orderPayStatus=SUCCESS 返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-30 12:00:00</para>
        /// </summary>
        [NameInMap("order_pay_time")]
        [Validation(Required=false)]
        public string OrderPayTime { get; set; }

        // 失败原因，条件返回：orderPayStatus=FAILED 返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>账户余额不足</para>
        /// </summary>
        [NameInMap("order_pay_failed_reason")]
        [Validation(Required=false)]
        public string OrderPayFailedReason { get; set; }

        // 支付金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>990</para>
        /// </summary>
        [NameInMap("pay_amount")]
        [Validation(Required=false)]
        public long? PayAmount { get; set; }

        // 实际支付金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>990</para>
        /// </summary>
        [NameInMap("real_pay_amount")]
        [Validation(Required=false)]
        public long? RealPayAmount { get; set; }

        // 收款金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>990</para>
        /// </summary>
        [NameInMap("real_receipt_amount")]
        [Validation(Required=false)]
        public long? RealReceiptAmount { get; set; }

    }

}
