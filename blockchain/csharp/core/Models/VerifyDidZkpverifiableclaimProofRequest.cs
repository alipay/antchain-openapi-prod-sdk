// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class VerifyDidZkpverifiableclaimProofRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 包含ZKP Proof的可验证声明
        [NameInMap("vc")]
        [Validation(Required=true)]
        public string Vc { get; set; }

        // ZKP验证信息
        [NameInMap("verify_zkp_proof")]
        [Validation(Required=true)]
        public List<DidZKPInfo> VerifyZkpProof { get; set; }

    }

}
