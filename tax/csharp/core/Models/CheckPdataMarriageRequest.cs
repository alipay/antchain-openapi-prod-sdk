// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class CheckPdataMarriageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务流水号
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 身份证
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 授权凭证
        [NameInMap("authorization_credential")]
        [Validation(Required=true)]
        public string AuthorizationCredential { get; set; }

        // 授权编号(同一机构内唯一)
        [NameInMap("authorization_no")]
        [Validation(Required=true)]
        public string AuthorizationNo { get; set; }

        // 授权格式
        [NameInMap("credential_type")]
        [Validation(Required=true)]
        public string CredentialType { get; set; }

        // 授权有效期
        [NameInMap("authorization_expiration_time")]
        [Validation(Required=false)]
        public string AuthorizationExpirationTime { get; set; }

        // 授权对象
        [NameInMap("authorization_type")]
        [Validation(Required=false)]
        public string AuthorizationType { get; set; }

    }

}
