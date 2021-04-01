// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitVcVcrepoVctransmitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // vc传输发起人did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // vc_transmit_init
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 使用对应的did私钥进行签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 可验证声明id
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // 传递目标
        [NameInMap("verifiers")]
        [Validation(Required=true)]
        public List<VcTransmitTargetStruct> Verifiers { get; set; }

    }

}
