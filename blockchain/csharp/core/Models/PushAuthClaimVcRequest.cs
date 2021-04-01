// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PushAuthClaimVcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 具体的业务类型，长度不超过32字符，具体需要与DIS小组业务对接商定新增的业务类型。
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 申请授权的具体内容，通常由业务方对接定义，在小程序展示声明详细内容给用户，用户进行确认后，授权颁发声明。
        [NameInMap("claim_content")]
        [Validation(Required=true)]
        public string ClaimContent { get; set; }

        // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
        [NameInMap("claim_type")]
        [Validation(Required=false)]
        public string ClaimType { get; set; }

        // 业务方持有的did身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

        // 申请目标did身份持有者，对声明进行授权颁发。
        [NameInMap("issuer_did")]
        [Validation(Required=true)]
        public string IssuerDid { get; set; }

        // 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则：
        // 1. Map<String,String> params 的key按照字典序排序
        // 2. 拼接为 key1=value1&key2=value2&key3=value3 ...
        // 3. 计算sha256(第2步结果)得到hash
        // 4. 使用hash 和 签名的did请求DIS的签名接口进行签名：baas.account.signature.start，https://apdevcenter.cloud.alipay.com/console/openapi/product/BLOCKCHAIN/apis/baas.account.signature.start/versions/1.0/document?
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
