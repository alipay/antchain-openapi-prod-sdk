// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetTextResponse : TeaModel {
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

        // 存证信息
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 可信信息
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public TsrResponse Tsr { get; set; }

        // 文本存证类型
        [NameInMap("text_notary_type")]
        [Validation(Required=false)]
        public string TextNotaryType { get; set; }

        // 哈希算法
        [NameInMap("hash_algorithm")]
        [Validation(Required=false)]
        public string HashAlgorithm { get; set; }

    }

}
