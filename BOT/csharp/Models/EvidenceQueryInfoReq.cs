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
        /// <summary>
        /// <b>Example:</b>
        /// <para>null</para>
        /// </summary>
        [NameInMap("device_signature")]
        [Validation(Required=false)]
        public string DeviceSignature { get; set; }

        // 暂时保留
        /// <summary>
        /// <b>Example:</b>
        /// <para>null</para>
        /// </summary>
        [NameInMap("device_uid")]
        [Validation(Required=false)]
        public string DeviceUid { get; set; }

        // 不同上链方式
        // "CZ": 普通存证
        // "IOTPAY": 支付存证
        // "RAW": 文本上链
        // "TTTS": 溯源存证
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;CZ&quot;</para>
        /// </summary>
        [NameInMap("query_type")]
        [Validation(Required=true)]
        public string QueryType { get; set; }

        // 查询的链上交易txHash
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;516e981c8b62c6ef08dc99b5f5165ab2a8592b5a116298788f95bbd45d0cc499&quot;</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
