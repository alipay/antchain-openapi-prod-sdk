// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 金额类
    public class MultiCurrencyMoneyOpenApi : TeaModel {
        // 最小币种单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>1233</para>
        /// </summary>
        [NameInMap("cent")]
        [Validation(Required=true)]
        public string Cent { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>156</para>
        /// </summary>
        [NameInMap("currency_value")]
        [Validation(Required=true)]
        public string CurrencyValue { get; set; }

    }

}
