// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 区块链信息
    public class BlockchainDTO : TeaModel {
        // 交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 当前块高
        /// <summary>
        /// <b>Example:</b>
        /// <para>12917</para>
        /// </summary>
        [NameInMap("block_number")]
        [Validation(Required=true)]
        public long? BlockNumber { get; set; }

    }

}
