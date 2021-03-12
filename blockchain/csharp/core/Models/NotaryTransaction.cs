// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 存证信息集合
    public class NotaryTransaction : TeaModel {
        // 如果存证类型为text, 则为存证内容
        // 如果存证类型为file,则为存证文件临时下载地址
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 链上存证哈希
        [NameInMap("transaction_hash")]
        [Validation(Required=true)]
        public string TransactionHash { get; set; }

        // 存证类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
