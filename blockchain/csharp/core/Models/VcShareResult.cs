// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // VC分享的结果
    public class VcShareResult : TeaModel {
        // 目标分享的VC的id
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // 分享给目标接受者的did
        [NameInMap("target_did")]
        [Validation(Required=true)]
        public string TargetDid { get; set; }

        // 分享链上VC数据的交易hash，可用于直连区块链查询交易内容时使用。
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 分享是否成功，true：成功，false：失败
        [NameInMap("status")]
        [Validation(Required=true)]
        public bool? Status { get; set; }

        // 失败的对应原因信息
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

    }

}
