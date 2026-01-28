// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class QueryBpserviceHttpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 请求头参数
        [NameInMap("headers")]
        [Validation(Required=false)]
        public List<NameValuePair> Headers { get; set; }

        // 请求体JSON String
        [NameInMap("request_body")]
        [Validation(Required=false)]
        public string RequestBody { get; set; }

        // 0-GET，1-POST，2-PUT，3-DELETE
        [NameInMap("http_method")]
        [Validation(Required=true)]
        public long? HttpMethod { get; set; }

    }

}
