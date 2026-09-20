// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 资金体
    public class FundItem : TeaModel {
        // fund_type
        /// <summary>
        /// <b>Example:</b>
        /// <para>PET</para>
        /// </summary>
        [NameInMap("fund_type")]
        [Validation(Required=true)]
        public string FundType { get; set; }

        // available_amount
        /// <summary>
        /// <b>Example:</b>
        /// <para>300.00</para>
        /// </summary>
        [NameInMap("available_amount")]
        [Validation(Required=true)]
        public string AvailableAmount { get; set; }

        // frozen_amount
        /// <summary>
        /// <b>Example:</b>
        /// <para>300.00</para>
        /// </summary>
        [NameInMap("can_refund_amount")]
        [Validation(Required=false)]
        public string CanRefundAmount { get; set; }

        // frozen_amount
        /// <summary>
        /// <b>Example:</b>
        /// <para>300.00</para>
        /// </summary>
        [NameInMap("frozen_amount")]
        [Validation(Required=true)]
        public string FrozenAmount { get; set; }

        // 原价
        /// <summary>
        /// <b>Example:</b>
        /// <para>300.00</para>
        /// </summary>
        [NameInMap("original_amount")]
        [Validation(Required=true)]
        public string OriginalAmount { get; set; }

    }

}
