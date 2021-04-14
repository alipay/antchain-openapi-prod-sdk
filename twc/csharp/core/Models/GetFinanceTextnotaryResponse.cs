// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetFinanceTextnotaryResponse : TeaModel {
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

        // 哈希算法
        [NameInMap("hash_algorithm")]
        [Validation(Required=false)]
        public string HashAlgorithm { get; set; }

        // 文本哈希
        [NameInMap("text_hash")]
        [Validation(Required=false)]
        public string TextHash { get; set; }

        // 可信时间戳
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public TsrResponse Tsr { get; set; }

        // 存证阶段
        [NameInMap("phase")]
        [Validation(Required=false)]
        public string Phase { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
