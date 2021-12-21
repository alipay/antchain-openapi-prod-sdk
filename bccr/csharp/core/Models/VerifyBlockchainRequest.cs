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

        // 文件OSS Id（上传文件有大小限制，文本文件最大100M，图片最大1G，视频和压缩包最大2G）
        // 
        // (和fileHash 二选一，必传一个，都传按fileHash为准)
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 核验用户信息
        [NameInMap("user_data")]
        [Validation(Required=false)]
        public VerifyUserData UserData { get; set; }

        // 核验权利声明信息
        [NameInMap("statement_data")]
        [Validation(Required=false)]
        public VerifyStatementData StatementData { get; set; }

        // 核验取证信息
        [NameInMap("evidence_data")]
        [Validation(Required=false)]
        public VerifyEvidenceData EvidenceData { get; set; }

    }

}
