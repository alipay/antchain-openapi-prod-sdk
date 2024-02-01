// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryPdataUnderwriteRequest : TeaModel {
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

        // 加密后的入参数据（包括姓名和身份ID）
        [NameInMap("encrypt_data")]
        [Validation(Required=false)]
        public string EncryptData { get; set; }

        // 省份行政区划代码list
        [NameInMap("recommand_province_list")]
        [Validation(Required=false)]
        public List<string> RecommandProvinceList { get; set; }

        // 授权编号
        [NameInMap("authorization_no")]
        [Validation(Required=false)]
        public string AuthorizationNo { get; set; }

        // 授权凭证
        [NameInMap("authorization_credential")]
        [Validation(Required=false)]
        public string AuthorizationCredential { get; set; }

        // 凭证格式
        [NameInMap("credential_type")]
        [Validation(Required=false)]
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
