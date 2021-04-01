// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartVcVcrepoControlleradduserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // controller did标示
        [NameInMap("controller")]
        [Validation(Required=true)]
        public string Controller { get; set; }

        // 操作缩写
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 实际参数
        [NameInMap("payload")]
        [Validation(Required=true)]
        public VcControllerAddUserRegisterPayload Payload { get; set; }

        // controller使用私钥对参数进行签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
