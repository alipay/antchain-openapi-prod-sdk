// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云区块链交易的汇总信息
    public class ALiYunTransactionSummary : TeaModel {
        // alias
        /// <summary>
        /// <b>Example:</b>
        /// <para>alias</para>
        /// </summary>
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // trans_type_v6
        /// <summary>
        /// <b>Example:</b>
        /// <para>trans_type_v6</para>
        /// </summary>
        [NameInMap("trans_type_v6")]
        [Validation(Required=false)]
        public string TransTypeV6 { get; set; }

        // trans_type_v10
        /// <summary>
        /// <b>Example:</b>
        /// <para>trans_type_v10</para>
        /// </summary>
        [NameInMap("trans_type_v10")]
        [Validation(Required=false)]
        public string TransTypeV10 { get; set; }

        // category
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("category")]
        [Validation(Required=false)]
        public long? Category { get; set; }

        // height
        /// <summary>
        /// <b>Example:</b>
        /// <para>2131231</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // block_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>block_hash</para>
        /// </summary>
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123123</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // reference_count
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("reference_count")]
        [Validation(Required=false)]
        public long? ReferenceCount { get; set; }

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

        // gas_used
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("gas_used")]
        [Validation(Required=false)]
        public long? GasUsed { get; set; }

    }

}
