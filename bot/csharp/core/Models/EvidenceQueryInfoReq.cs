// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 信物链存证查询请求结构体
    public class EvidenceQueryInfoReq : TeaModel {
        // 暂时保留
        [NameInMap("device_signature")]
        [Validation(Required=false)]
        public string DeviceSignature { get; set; }

        // 暂时保留
        [NameInMap("device_uid")]
        [Validation(Required=false)]
        public string DeviceUid { get; set; }

        // 不同上链方式
        // "CZ": 普通存证
        // "IOTPAY": 支付存证
        // "RAW": 文本上链
        // "TTTS": 溯源存证
        [NameInMap("query_type")]
        [Validation(Required=true)]
        public string QueryType { get; set; }

        // 查询的链上交易txHash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
