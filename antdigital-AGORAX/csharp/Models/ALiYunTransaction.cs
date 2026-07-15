// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云交易查询信息
    public class ALiYunTransaction : TeaModel {
        // tx_type
        /// <summary>
        /// <b>Example:</b>
        /// <para>tx_type</para>
        /// </summary>
        [NameInMap("tx_type")]
        [Validation(Required=false)]
        public string TxType { get; set; }

        // data
        /// <summary>
        /// <b>Example:</b>
        /// <para>data</para>
        /// </summary>
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // from
        /// <summary>
        /// <b>Example:</b>
        /// <para>from</para>
        /// </summary>
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // to
        /// <summary>
        /// <b>Example:</b>
        /// <para>to</para>
        /// </summary>
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // timestamp
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231231</para>
        /// </summary>
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // period
        /// <summary>
        /// <b>Example:</b>
        /// <para>12312312</para>
        /// </summary>
        [NameInMap("period")]
        [Validation(Required=false)]
        public long? Period { get; set; }

        // nonce
        /// <summary>
        /// <b>Example:</b>
        /// <para>nonce</para>
        /// </summary>
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

        // gas
        /// <summary>
        /// <b>Example:</b>
        /// <para>gas</para>
        /// </summary>
        [NameInMap("gas")]
        [Validation(Required=false)]
        public string Gas { get; set; }

        // value
        /// <summary>
        /// <b>Example:</b>
        /// <para>value</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // signatures
        /// <summary>
        /// <b>Example:</b>
        /// <para>signatures</para>
        /// </summary>
        [NameInMap("signatures")]
        [Validation(Required=false)]
        public List<string> Signatures { get; set; }

        // extentions
        /// <summary>
        /// <b>Example:</b>
        /// <para>extentions</para>
        /// </summary>
        [NameInMap("extentions")]
        [Validation(Required=false)]
        public List<string> Extentions { get; set; }

    }

}
