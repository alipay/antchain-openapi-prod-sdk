// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 链上交易信息
    public class TxInfo : TeaModel {
        // 上链结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("tx_receipt_result")]
        [Validation(Required=true)]
        public string TxReceiptResult { get; set; }

        // 区块链id
        /// <summary>
        /// <b>Example:</b>
        /// <para>c4b83bb3080a4a19957af5b0b4430542</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>aeedaaf3abb4a1ce86de538ec42759626689ea59fdfba4a10a0ef1550aa10d3d</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 交易类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>TX_DEPOSIT_DATA</para>
        /// </summary>
        [NameInMap("tx_type")]
        [Validation(Required=true)]
        public string TxType { get; set; }

        // 时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>1638796927336</para>
        /// </summary>
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 区块高度
        /// <summary>
        /// <b>Example:</b>
        /// <para>68772416</para>
        /// </summary>
        [NameInMap("block_number")]
        [Validation(Required=true)]
        public string BlockNumber { get; set; }

        // 交易随机数Nonce
        /// <summary>
        /// <b>Example:</b>
        /// <para>505563366098488426</para>
        /// </summary>
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        // 发起地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304</para>
        /// </summary>
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 目标地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304</para>
        /// </summary>
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>9357e09984d9ba31f0f6070a8276b0d39ffeb8c40aaa7a6873cc69a04ea4babf7295d642aeb945b5eca6624751e11e41885d918deae554abd8d732f95e31d44f00</para>
        /// </summary>
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
