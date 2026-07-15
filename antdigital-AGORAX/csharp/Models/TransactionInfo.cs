// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 交易详情
    public class TransactionInfo : TeaModel {
        // 交易时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>timestamp</para>
        /// </summary>
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // 交易块高
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // 交易所在块高
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash</para>
        /// </summary>
        [NameInMap("blockhash")]
        [Validation(Required=true)]
        public string Blockhash { get; set; }

        // 交易来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash</para>
        /// </summary>
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 交易地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash</para>
        /// </summary>
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 交易类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("txtype")]
        [Validation(Required=true)]
        public long? Txtype { get; set; }

        // 转账额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // logs
        /// <summary>
        /// <b>Example:</b>
        /// <para>logs</para>
        /// </summary>
        [NameInMap("logs")]
        [Validation(Required=true)]
        public string Logs { get; set; }

        // 燃料消耗
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("gasused")]
        [Validation(Required=true)]
        public long? Gasused { get; set; }

        // result
        /// <summary>
        /// <b>Example:</b>
        /// <para>result</para>
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 拓展json字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>json</para>
        /// </summary>
        [NameInMap("json")]
        [Validation(Required=true)]
        public string Json { get; set; }

    }

}
