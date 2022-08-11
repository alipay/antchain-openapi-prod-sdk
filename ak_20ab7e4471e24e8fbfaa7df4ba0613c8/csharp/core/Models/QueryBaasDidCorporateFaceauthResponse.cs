// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_20ab7e4471e24e8fbfaa7df4ba0613c8.Models
{
    public class QueryBaasDidCorporateFaceauthResponse : TeaModel {
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

        // 生成的did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // vc id，可通过该字符串来查询vc具体内容
        [NameInMap("vc_id")]
        [Validation(Required=false)]
        public string VcId { get; set; }

    }

}
