// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 蚂蚁链浏览器交易信息
    public class BlockchainBrowserTransaction : TeaModel {
        // bizid
        /// <summary>
        /// <b>Example:</b>
        /// <para>27ce375122ef483691488395808e009e</para>
        /// </summary>
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // block_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694</para>
        /// </summary>
        [NameInMap("block_hash")]
        [Validation(Required=true)]
        public string BlockHash { get; set; }

        // category
        /// <summary>
        /// <b>Example:</b>
        /// <para>-1</para>
        /// </summary>
        [NameInMap("category")]
        [Validation(Required=true)]
        public long? Category { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>1604565299516</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // from
        /// <summary>
        /// <b>Example:</b>
        /// <para>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</para>
        /// </summary>
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // gas_used
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("gas_used")]
        [Validation(Required=true)]
        public long? GasUsed { get; set; }

        // hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // height
        /// <summary>
        /// <b>Example:</b>
        /// <para>6814087</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // reference_count
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("reference_count")]
        [Validation(Required=true)]
        public long? ReferenceCount { get; set; }

        // to
        /// <summary>
        /// <b>Example:</b>
        /// <para>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</para>
        /// </summary>
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // transaction_type
        /// <summary>
        /// <b>Example:</b>
        /// <para>TX_DEPOSIT_DATA</para>
        /// </summary>
        [NameInMap("transaction_type")]
        [Validation(Required=true)]
        public string TransactionType { get; set; }

        // block_version
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("block_version")]
        [Validation(Required=true)]
        public long? BlockVersion { get; set; }

        // blockchain_name
        /// <summary>
        /// <b>Example:</b>
        /// <para>BAASQATEST</para>
        /// </summary>
        [NameInMap("blockchain_name")]
        [Validation(Required=true)]
        public string BlockchainName { get; set; }

        // blockchain_status
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("blockchain_status")]
        [Validation(Required=true)]
        public bool? BlockchainStatus { get; set; }

        // content
        /// <summary>
        /// <b>Example:</b>
        /// <para>eyJ0cmFuc2FjdGlvbl9pZCI6ImRjM2YyZTYz</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // hash_status
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("hash_status")]
        [Validation(Required=true)]
        public bool? HashStatus { get; set; }

        // type
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // transaction_contract
        /// <summary>
        /// <b>Example:</b>
        /// <para>transaction_contract</para>
        /// </summary>
        [NameInMap("transaction_contract")]
        [Validation(Required=true)]
        public BlockchainBrowserTransactionContract TransactionContract { get; set; }

    }

}
