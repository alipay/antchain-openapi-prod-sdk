// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 费用分项
    public class FeeDetail : TeaModel {
        // 费用描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>网页取证起步费用</para>
        /// </summary>
        [NameInMap("fee_desc")]
        [Validation(Required=true)]
        public string FeeDesc { get; set; }

        // 费用
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

    }

}
