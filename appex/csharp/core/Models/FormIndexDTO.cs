// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 表单链下链上锚定索引
    public class FormIndexDTO : TeaModel {
        // 业务表单ID
        [NameInMap("form_id")]
        [Validation(Required=true)]
        public string FormId { get; set; }

        // 业务表单类型
        [NameInMap("form_type")]
        [Validation(Required=true)]
        public string FormType { get; set; }

        // 块高
        [NameInMap("block_height")]
        [Validation(Required=true)]
        public long? BlockHeight { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 交易时间戳
        [NameInMap("tx_timestamp")]
        [Validation(Required=true)]
        public string TxTimestamp { get; set; }

    }

}
