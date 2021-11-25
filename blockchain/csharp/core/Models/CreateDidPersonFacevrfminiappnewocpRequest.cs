// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDidPersonFacevrfminiappnewocpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，通常针对性特别支持，或者防止多调用方使用相同租户身份的情况下用bizCode做区分。
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 请求的唯一标识，通常为32字符宽度的字符串内容，也可以只用UUID，此参数通常用来支持幂等，或者排查问题，调用方可以使用业务流水号。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 姓名字段，真实姓名，不可包含空格等特殊字符。
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件号码，要求带有字母的情况使用大写字母。
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 身份信息来源类型，当前仅支持证件（CERT_INFO）
        [NameInMap("identity_type")]
        [Validation(Required=true)]
        public string IdentityType { get; set; }

        // 证件类型，当前仅支持身份证（IDENTITY_CARD）
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 认证结束回跳地址
        [NameInMap("return_url")]
        [Validation(Required=true)]
        public string ReturnUrl { get; set; }

        // DID未来创建锚定的用户身份唯一关联，如果不设置此参数则使用二要素拼接后的哈希值 SHA256("张三"+"210282*****X") 来进行关联创建DID，并且支持幂等。
        [NameInMap("uid")]
        [Validation(Required=false)]
        public string Uid { get; set; }

    }

}
