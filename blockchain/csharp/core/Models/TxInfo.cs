// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 链上交易信息
    public class TxInfo : TeaModel {
        // 上链结果
        [NameInMap("tx_receipt_result")]
        [Validation(Required=true)]
        public string TxReceiptResult { get; set; }

        // 区块链id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 交易类型
        [NameInMap("tx_type")]
        [Validation(Required=true)]
        public string TxType { get; set; }

        // 时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 区块高度
        [NameInMap("block_number")]
        [Validation(Required=true)]
        public string BlockNumber { get; set; }

        // 交易随机数Nonce
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        // 发起地址
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 目标地址
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
