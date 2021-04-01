// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PushAuthUserVcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪。
        [NameInMap("biz_id")]
        [Validation(Required=true, MaxLength=64)]
        public string BizId { get; set; }

        // 具体的业务类型，长度不超过32字符，具体需要与DIS小组业务对接商定新增的业务类型。
        [NameInMap("biz_type")]
        [Validation(Required=true, MaxLength=32)]
        public string BizType { get; set; }

        // 推送的业务方自己所属的did，也就是颁发此声明的 issuer
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则：
        // 1. Map<String,String> params 的key按照字典序排序
        // 2. 拼接为 key1=value1&key2=value2&key3=value3 ...
        // 3. 计算sha256(第2步结果)得到hash
        // 4. 使用hash 和 签名的did请求DIS的签名接口进行签名：baas.account.signature.start，https://apdevcenter.cloud.alipay.com/console/openapi/product/BLOCKCHAIN/apis/baas.account.signature.start/versions/1.0/document?
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 通过DIS颁发的声明详细信息，其中content的claim字段是和业务相关的实际声明内容。
        [NameInMap("vc_content")]
        [Validation(Required=true)]
        public string VcContent { get; set; }

    }

}
