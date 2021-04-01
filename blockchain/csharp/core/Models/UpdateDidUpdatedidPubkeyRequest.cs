// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateDidUpdatedidPubkeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // did描述符
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 具体操作名
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 需要更新的新的公钥，仅在未完成上链的DID 才能做这个更新
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // sig(hash(operation+payload+did)) 使用sdk生成方式
        [NameInMap("request_signature")]
        [Validation(Required=true)]
        public string RequestSignature { get; set; }

    }

}
