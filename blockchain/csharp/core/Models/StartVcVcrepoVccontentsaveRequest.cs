// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartVcVcrepoVccontentsaveRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起者did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 操作缩写
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // vc原文内容
        [NameInMap("payload")]
        [Validation(Required=true)]
        public string Payload { get; set; }

        // 用户使用私钥对参数进行签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
