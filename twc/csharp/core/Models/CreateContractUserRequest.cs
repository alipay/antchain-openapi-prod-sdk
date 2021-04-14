// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户类型为机构时，填写机构信息
        [NameInMap("organization")]
        [Validation(Required=false)]
        public ContractOrganizationApplication Organization { get; set; }

        // 用户类型为个人时，则为个人用户信息；用户类型为机构时，则为机构账号经办人信息
        [NameInMap("user")]
        [Validation(Required=true)]
        public ContractAccountApplication User { get; set; }

        // 用户类型，个人（PERSON）或机构（ORGANIZATION）
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

    }

}
