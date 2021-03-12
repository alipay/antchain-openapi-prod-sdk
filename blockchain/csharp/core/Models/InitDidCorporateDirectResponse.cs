// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitDidCorporateDirectResponse : TeaModel {
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

        // did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // did doc content
        [NameInMap("doc")]
        [Validation(Required=false)]
        public string Doc { get; set; }

        // 后续did doc上链需要使用私钥对这个hash值进行签名
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

    }

}
