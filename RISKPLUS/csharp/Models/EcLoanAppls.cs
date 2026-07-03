// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 电商支用订单详情
    public class EcLoanAppls : TeaModel {
        // 客户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>232</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 申请单号 系统的申请单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1232</para>
        /// </summary>
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 提款单状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 借据号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("loan_no")]
        [Validation(Required=true)]
        public string LoanNo { get; set; }

    }

}
