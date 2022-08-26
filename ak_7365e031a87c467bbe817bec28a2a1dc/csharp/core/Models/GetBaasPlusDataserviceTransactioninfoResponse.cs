// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_7365e031a87c467bbe817bec28a2a1dc.Models
{
    public class GetBaasPlusDataserviceTransactioninfoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 区块链唯一性标识
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // category
        [NameInMap("category")]
        [Validation(Required=false)]
        public long? Category { get; set; }

        // 交易发起时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 交易发起方哈希
        [NameInMap("from_hash")]
        [Validation(Required=false)]
        public string FromHash { get; set; }

        // 交易哈希
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 块高
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 交易接收方哈希
        [NameInMap("to_hash")]
        [Validation(Required=false)]
        public string ToHash { get; set; }

        // 交易类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

    }

}
