// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidVcrepositoryAuthwithdefineidRequest : TeaModel {
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

        // 自定义的业务id，通常此字段不是"vc:mychain:"前缀开头，会使用如下规则生成最终verifiable_claim_id： verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(issuer_did, subject_did, define_id)); 此表达式参与SHA256的 define_id 为用户指定的当前参数。
        [NameInMap("define_id")]
        [Validation(Required=true)]
        public string DefineId { get; set; }

        // 请求操作的did，也是目标VC的owner，也就是VC内容中的subject did身份。
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 目标证书的颁发者did。
        [NameInMap("issuer_did")]
        [Validation(Required=true)]
        public string IssuerDid { get; set; }

        // 保留字段，请求增加授权的调用方did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 目标证书VC的颁发目标did。
        [NameInMap("subject_did")]
        [Validation(Required=true)]
        public string SubjectDid { get; set; }

    }

}
