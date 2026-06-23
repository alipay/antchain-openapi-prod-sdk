// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 多币种货币类
    public class MultiCurrencyMoney : TeaModel {
        // 金额，以分为单位
        [NameInMap("cent")]
        [Validation(Required=true)]
        public long? Cent { get; set; }

        // 支付宝体系内一般存储币种值
        /// <summary>
        /// <b>Example:</b>
        /// <para>156</para>
        /// </summary>
        [NameInMap("currency_value")]
        [Validation(Required=true)]
        public string CurrencyValue { get; set; }

    }

}
