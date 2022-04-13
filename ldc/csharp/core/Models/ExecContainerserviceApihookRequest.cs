// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ExecContainerserviceApihookRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // url地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // GET/POST
        [NameInMap("http_method")]
        [Validation(Required=true)]
        public string HttpMethod { get; set; }

        // 请求参数
        [NameInMap("query_params")]
        [Validation(Required=false)]
        public string QueryParams { get; set; }

        // 请求body
        [NameInMap("body")]
        [Validation(Required=false)]
        public string Body { get; set; }

        // application/x-www-form-urlencoded或application/json
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

    }

}
