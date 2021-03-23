// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 数据归属权
    public class DataTransferObject : TeaModel {
        // 发起方
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 转交方
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 流转备注
        [NameInMap("form_body")]
        [Validation(Required=true)]
        public string FormBody { get; set; }

        // 链上流转记录
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 链上时间戳
        // 
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
