// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 前端配置
    public class SofaGwDownstream : TeaModel {
        // 认证信息
        [NameInMap("auth")]
        [Validation(Required=false)]
        public List<SofaGwAuthenticationVO> Auth { get; set; }

        // GET/POST/PUT/DELETE
        [NameInMap("method")]
        [Validation(Required=false)]
        public string Method { get; set; }

        // 协议
        [NameInMap("schema")]
        [Validation(Required=false)]
        public string Schema { get; set; }

        // url
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 是否签名
        [NameInMap("verify")]
        [Validation(Required=false)]
        public bool? Verify { get; set; }

    }

}
