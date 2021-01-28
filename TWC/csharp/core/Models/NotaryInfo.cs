// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 存证信息说明
    public class NotaryInfo : TeaModel {
        // 存证内容的哈希值，默认采用SHA256算法
        [NameInMap("content_hash")]
        [Validation(Required=true)]
        public string ContentHash { get; set; }

        // 合作人（版权存证函专用），会展示在存证证明中
        [NameInMap("cooperation")]
        [Validation(Required=false)]
        public string Cooperation { get; set; }

        // 作品名称类型（版权存证函使用），会展示在存证证明中
        [NameInMap("creation_type")]
        [Validation(Required=false)]
        public string CreationType { get; set; }

        // 如果是文件存证，可填写文件名称
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 计算content_hash的哈希算法，目前只支持SHA256
        [NameInMap("hash_algorithm")]
        [Validation(Required=false)]
        public string HashAlgorithm { get; set; }

        // 申请平台名，用于在存证函上显示用名称
        [NameInMap("platform")]
        [Validation(Required=false)]
        public string Platform { get; set; }

        // 文件容量，默认为0
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

        // 发起存证成功后，返回的存证凭据
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 存证事务ID
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

    }

}
