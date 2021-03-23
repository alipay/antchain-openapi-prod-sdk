// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class QueryUnionFormResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 块高
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 交易时间戳
        [NameInMap("tx_timestamp")]
        [Validation(Required=false)]
        public string TxTimestamp { get; set; }

        // 业务表单ID
        [NameInMap("form_id")]
        [Validation(Required=false)]
        public string FormId { get; set; }

        // 业务单据类型
        [NameInMap("form_type")]
        [Validation(Required=false)]
        public string FormType { get; set; }

        // 解密后原始表单内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
