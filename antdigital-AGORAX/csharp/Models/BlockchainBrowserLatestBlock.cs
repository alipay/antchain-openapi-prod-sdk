// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 蚂蚁链最新区块列表信息
    public class BlockchainBrowserLatestBlock : TeaModel {
        // bizid
        /// <summary>
        /// <b>Example:</b>
        /// <para>bizid</para>
        /// </summary>
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // block_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>block_hash</para>
        /// </summary>
        [NameInMap("block_hash")]
        [Validation(Required=true)]
        public string BlockHash { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>1604564398000</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // height
        /// <summary>
        /// <b>Example:</b>
        /// <para>6812497</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // previous_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>f6d51d362abc1b31e42dbd88d5ce0660cb96b8d0c0a4293cd29ffa042f61c784</para>
        /// </summary>
        [NameInMap("previous_hash")]
        [Validation(Required=true)]
        public string PreviousHash { get; set; }

        // root_tx_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>da9a42027ab141c8396b7fc78d74c94264da71f6361ac468385bed3fbc5408b4</para>
        /// </summary>
        [NameInMap("root_tx_hash")]
        [Validation(Required=true)]
        public string RootTxHash { get; set; }

        // size
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

        // transaction_size
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("transaction_size")]
        [Validation(Required=true)]
        public long? TransactionSize { get; set; }

        // version
        /// <summary>
        /// <b>Example:</b>
        /// <para>258</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=true)]
        public long? Version { get; set; }

    }

}
