// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 退款列表
    public class RefundList : TeaModel {
        // 退款业务号
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("out_request_no")]
        [Validation(Required=true)]
        public string OutRequestNo { get; set; }

        // 本次退款金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.09</para>
        /// </summary>
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public string RefundAmount { get; set; }

        // 退款状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("refund_status")]
        [Validation(Required=true)]
        public string RefundStatus { get; set; }

    }

}
