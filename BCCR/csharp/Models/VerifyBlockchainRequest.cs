// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class VerifyBlockchainRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 统一证据编号（存证交易HASH）
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 文件HASH，使用HEX的完整表示，如 6460c949f8a347eb...
        // 
        // (和fileId 二选一，必传一个，都传按fileHash为准)
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

    }

}
