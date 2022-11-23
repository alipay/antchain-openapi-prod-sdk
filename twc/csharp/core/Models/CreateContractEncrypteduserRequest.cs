// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractEncrypteduserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 注册机构用户。类型为机构时(userType = "ORGANIZATION")，该字段必填。
        [NameInMap("organization")]
        [Validation(Required=true)]
        public ContractOrganizationApplication Organization { get; set; }

        // 注册为个人用户时，该字段表示个人用户的相关信息；
        // 注册为机构用户时，该字段表示对应机构经办人的个人信息。
        [NameInMap("user")]
        [Validation(Required=true)]
        public ContractAccountApplication User { get; set; }

        // 用户类型
        // 个人：PERSON；
        // 机构：ORGANIZATION
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

    }

}
