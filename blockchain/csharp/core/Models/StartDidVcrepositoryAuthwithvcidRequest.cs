// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidVcrepositoryAuthwithvcidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 配置此did列表，为这些did分配读取目标VC的权限，如果目标VC存储时是明文存储，则操作失败（无需做此权限管控）。
        [NameInMap("auth_did_list")]
        [Validation(Required=true)]
        public string AuthDidList { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 目标VC的owner，也就是VC内容中的subject did身份。
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 保留字段，请求增加授权的调用方did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 通过指定目标证书VC的唯一verifiable_claim_id来找到目标证书VC并新增授权。
        [NameInMap("verifiable_claim_id")]
        [Validation(Required=true)]
        public string VerifiableClaimId { get; set; }

    }

}
