// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统-二级商户交易退款查询结果-分期付
    public class TradeRefundResult : TeaModel {
        // 退款请求编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>20880002000001</para>
        /// </summary>
        [NameInMap("request_no")]
        [Validation(Required=true)]
        public string RequestNo { get; set; }

        // 退款金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>30</para>
        /// </summary>
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public long? RefundAmount { get; set; }

        // 退款原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>不想要了</para>
        /// </summary>
        [NameInMap("refund_reason")]
        [Validation(Required=true)]
        public string RefundReason { get; set; }

        // 退款状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>REFUND_SUCCESS</para>
        /// </summary>
        [NameInMap("refund_status")]
        [Validation(Required=true)]
        public string RefundStatus { get; set; }

        // 退款失败原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>参数异常</para>
        /// </summary>
        [NameInMap("refund_fail_reason")]
        [Validation(Required=true)]
        public string RefundFailReason { get; set; }

    }

}
