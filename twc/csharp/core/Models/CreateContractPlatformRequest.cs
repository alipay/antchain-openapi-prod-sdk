// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractPlatformRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 平台方经办人信息
        [NameInMap("creator")]
        [Validation(Required=true)]
        public ContractAccountApplication Creator { get; set; }

        // 平台机构信息
        [NameInMap("platform")]
        [Validation(Required=true)]
        public ContractOrganizationApplication Platform { get; set; }

    }

}
