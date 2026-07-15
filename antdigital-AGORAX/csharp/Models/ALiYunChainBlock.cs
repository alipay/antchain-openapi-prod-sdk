// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云区块链区块信息
    public class ALiYunChainBlock : TeaModel {
        // ant_chain_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ant_chain_id</para>
        /// </summary>
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

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
        /// <para>create_time</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // height
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // previous_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>previous_hash</para>
        /// </summary>
        [NameInMap("previous_hash")]
        [Validation(Required=false)]
        public string PreviousHash { get; set; }

        // root_tx_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>root_tx_hash</para>
        /// </summary>
        [NameInMap("root_tx_hash")]
        [Validation(Required=false)]
        public string RootTxHash { get; set; }

        // transaction_size
        /// <summary>
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("transaction_size")]
        [Validation(Required=false)]
        public long? TransactionSize { get; set; }

        // trans_summary_list
        /// <summary>
        /// <b>Example:</b>
        /// <para>trans_summary_list</para>
        /// </summary>
        [NameInMap("trans_summary_list")]
        [Validation(Required=false)]
        public List<ALiYunTransactionSummary> TransSummaryList { get; set; }

        // Version
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

    }

}
