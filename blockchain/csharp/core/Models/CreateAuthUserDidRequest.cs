// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateAuthUserDidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 通常为业务方持有的企业did身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 扩展用户信息字段，用于创建did特别场景，传递更多用户信息。
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 是否实人认证，如果"T"表示已实人认证，否则未认证。
        [NameInMap("is_certified")]
        [Validation(Required=false)]
        public string IsCertified { get; set; }

        // 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名接口进行签名：baas.account.signature.start，https://apdevcenter.cloud.alipay.com/console/openapi/product/BLOCKCHAIN/apis/baas.account.signature.start/versions/1.0/document?
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 业务方内部用户的id，可脱敏id，在一些id打通场景有特别用途。
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
