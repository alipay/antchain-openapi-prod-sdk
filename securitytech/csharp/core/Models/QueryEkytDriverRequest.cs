// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryEkytDriverRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接口请求head
        [NameInMap("head")]
        [Validation(Required=true)]
        public RequestHead Head { get; set; }

        // 请求业务参数，加密之后的密文信息
        [NameInMap("request")]
        [Validation(Required=true)]
        public string Request { get; set; }

        // 请求数据签名值
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
