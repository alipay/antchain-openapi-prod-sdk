// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class RunApiDataprocessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数json
        [NameInMap("biz_param")]
        [Validation(Required=true)]
        public string BizParam { get; set; }

        // 产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 调用的方法
        [NameInMap("method_code")]
        [Validation(Required=true)]
        public string MethodCode { get; set; }

        // 租户编码
        [NameInMap("inst_code")]
        [Validation(Required=false)]
        public string InstCode { get; set; }

        // RSA-DESede
        // 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
        [NameInMap("algorithm")]
        [Validation(Required=false)]
        public string Algorithm { get; set; }

        // 是否采用加密算法
        [NameInMap("encryption")]
        [Validation(Required=false)]
        public bool? Encryption { get; set; }

        // 对称秘钥加密后的数据
        [NameInMap("encryption_key")]
        [Validation(Required=false)]
        public string EncryptionKey { get; set; }

    }

}
