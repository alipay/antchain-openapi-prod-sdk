// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 蚂蚁链浏览器区块信息
    public class BlockchainBrowserBlock : TeaModel {
        // bizid
        /// <summary>
        /// <b>Example:</b>
        /// <para>27ce375122ef483691488395808e009e</para>
        /// </summary>
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

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
        /// <para>true</para>
        /// </summary>
        [NameInMap("blockchain_status")]
        [Validation(Required=true)]
        public bool? BlockchainStatus { get; set; }

        // block_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694</para>
        /// </summary>
        [NameInMap("block_hash")]
        [Validation(Required=true)]
        public string BlockHash { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>1604565300002</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // hash_status
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("hash_status")]
        [Validation(Required=true)]
        public bool? HashStatus { get; set; }

        // height
        /// <summary>
        /// <b>Example:</b>
        /// <para>6814087</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // previous_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>e70b3768125ac3543ba0c823fa56500eb4516c165cb7fd1489961fac961ee5f1</para>
        /// </summary>
        [NameInMap("previous_hash")]
        [Validation(Required=true)]
        public string PreviousHash { get; set; }

        // root_tx_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>711f000e6604bf49bc4434b8ecd57ac98c0519e817d8f75bf6eef3caea7a0d79</para>
        /// </summary>
        [NameInMap("root_tx_hash")]
        [Validation(Required=true)]
        public string RootTxHash { get; set; }

        // transaction_list
        /// <summary>
        /// <b>Example:</b>
        /// <para>transaction_list</para>
        /// </summary>
        [NameInMap("transaction_list")]
        [Validation(Required=true)]
        public List<BlockchainBrowserTransaction> TransactionList { get; set; }

        // transaction_size
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("transaction_size")]
        [Validation(Required=true)]
        public long? TransactionSize { get; set; }

    }

}
