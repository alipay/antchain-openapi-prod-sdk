// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 退分账明细信息
    public class RefundRoyaltyResult : TeaModel {
        // 退分账金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>12.50</para>
        /// </summary>
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public string RefundAmount { get; set; }

        // 退分账结果码
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

    }

}
