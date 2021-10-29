// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAAS_MIDWAY.Models
{
    public class CreateTlsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 非对称加密算法
        [NameInMap("tls_algo")]
        [Validation(Required=false)]
        public string TlsAlgo { get; set; }

        // 密码
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

        // 封装格式
        [NameInMap("key_format")]
        [Validation(Required=false)]
        public string KeyFormat { get; set; }

    }

}
