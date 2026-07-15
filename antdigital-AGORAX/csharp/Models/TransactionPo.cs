// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // blockchain交易结构体
    public class TransactionPo : TeaModel {
        // 交易所在块hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0</para>
        /// </summary>
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // 交易来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0</para>
        /// </summary>
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // gas消耗
        /// <summary>
        /// <b>Example:</b>
        /// <para>1111</para>
        /// </summary>
        [NameInMap("gas_used")]
        [Validation(Required=false)]
        public long? GasUsed { get; set; }

        // 交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>ce386c5510df2e358056893b86ba77178fcf00d90de9c56bd788fd1968c9b58d</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 交易所在块 块高
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 交易返回结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // 交易时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1573401600000</para>
        /// </summary>
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // 交易地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>4a5e107d0ea041f25ca7bfb58503e6549913e67e5d07aadfe359418440359fec</para>
        /// </summary>
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // 交易类型 同SDK
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("tx_type")]
        [Validation(Required=false)]
        public long? TxType { get; set; }

        // 转账额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>1111</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public long? Value { get; set; }

    }

}
