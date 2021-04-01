// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidVcrepositoryReadwithvcidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求读取数据的did。
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 保留字段，请求读的did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 要查询的这个vc属于哪个did，如果未指定，did会尝试从默认vc仓库获取
        [NameInMap("subject_did")]
        [Validation(Required=false)]
        public string SubjectDid { get; set; }

        // 通过指定目标证书VC的唯一verifiable_claim_id来读取内容。
        [NameInMap("verifiable_claim_id")]
        [Validation(Required=true)]
        public string VerifiableClaimId { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
