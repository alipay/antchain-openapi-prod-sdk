// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryPdataRiskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务流水号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 手机号
        [NameInMap("phone_no")]
        [Validation(Required=false)]
        public string PhoneNo { get; set; }

        // 渠道编码
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

        // 模型id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 授权编号
        [NameInMap("authorization_code")]
        [Validation(Required=false)]
        public string AuthorizationCode { get; set; }

        // 授权凭证
        [NameInMap("authorization_credential")]
        [Validation(Required=false)]
        public string AuthorizationCredential { get; set; }

        // 凭证格式
        [NameInMap("credential_type")]
        [Validation(Required=false)]
        public string CredentialType { get; set; }

        // 主键类型
        [NameInMap("key_type")]
        [Validation(Required=true)]
        public string KeyType { get; set; }

    }

}
