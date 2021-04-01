// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartVcVcrepositoryAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 指定情况跟随 auth_did_list，如果auth_did_list不指定，则此字段无需指定，否则是与auth_did_list长度相同，并且对应auth_did_list的did的公钥加密AES密钥的结果。
        [NameInMap("auth_access_key_list")]
        [Validation(Required=true)]
        public List<string> AuthAccessKeyList { get; set; }

        // 本次追加授权的did列表
        [NameInMap("auth_did_list")]
        [Validation(Required=true)]
        public List<string> AuthDidList { get; set; }

        // 提交请求的did，通常是目标VC的subject did，也就是VC的owner。
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 对当前VC Repository操作的描述，signature字段需要包含此操作的描述，最终会记录在VC Repository连接的链上，可追溯此operation操作记录。
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 读数据请求的did对应使用公钥做的数据签名，确保数据准确性，签名包含operation字段，会一起上链。
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 目标VC的唯一id标识。
        [NameInMap("verifiable_claim_id")]
        [Validation(Required=true)]
        public string VerifiableClaimId { get; set; }

    }

}
