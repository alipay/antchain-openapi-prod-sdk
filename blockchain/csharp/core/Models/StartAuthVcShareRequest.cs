// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVcShareRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 非托管的情况下必选，业务方持有的did身份。
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
        [NameInMap("index")]
        [Validation(Required=false)]
        public string Index { get; set; }

        // 非托管的情况下必选。 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名。
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 分享声明的目标方DID
        [NameInMap("target_did")]
        [Validation(Required=true)]
        public string TargetDid { get; set; }

        // 分享权限的目标可验证声明(VC)的ID
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // vc_id的owner，将持有的vc_id分享给目标target_did
        [NameInMap("owner_did")]
        [Validation(Required=true)]
        public string OwnerDid { get; set; }

    }

}
