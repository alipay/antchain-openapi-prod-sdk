// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 预付金额
    public class PrepayAmount : TeaModel {
        // 指定预付费金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>100.00</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 币种单位，CNY\USD等标准币种单位编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>CNY</para>
        /// </summary>
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

    }

}
