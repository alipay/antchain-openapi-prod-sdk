// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidZkpverifiableclaimVisibilityResponse : TeaModel {
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

        // 索引字段，标示哪些字段是原始值，哪些字段是hash值
        [NameInMap("index")]
        [Validation(Required=false)]
        public string Index { get; set; }

        // 被隐藏了部分内容的VC内容
        [NameInMap("vc_view")]
        [Validation(Required=false)]
        public string VcView { get; set; }

    }

}
