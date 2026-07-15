// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 数字资产管理平台版通交易信息
    public class EPTradeInfo : TeaModel {
        // 版通代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>000111</para>
        /// </summary>
        [NameInMap("ep_code")]
        [Validation(Required=true)]
        public string EpCode { get; set; }

        // 版通交易号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("tx_code")]
        [Validation(Required=true)]
        public string TxCode { get; set; }

        // 卖方账户
        /// <summary>
        /// <b>Example:</b>
        /// <para>testAccount</para>
        /// </summary>
        [NameInMap("tx_from")]
        [Validation(Required=true)]
        public string TxFrom { get; set; }

        // 交易时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>1560827725</para>
        /// </summary>
        [NameInMap("tx_time")]
        [Validation(Required=true)]
        public long? TxTime { get; set; }

        // 买方账户
        /// <summary>
        /// <b>Example:</b>
        /// <para>testAccount</para>
        /// </summary>
        [NameInMap("tx_to")]
        [Validation(Required=true)]
        public string TxTo { get; set; }

        // 交易数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("tx_value")]
        [Validation(Required=true)]
        public long? TxValue { get; set; }

    }

}
