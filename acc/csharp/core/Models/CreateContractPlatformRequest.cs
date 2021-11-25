// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateContractPlatformRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 创建个人
        [NameInMap("creator")]
        [Validation(Required=true)]
        public Contractaccountapplication Creator { get; set; }

        // 合同企业信息
        [NameInMap("platform")]
        [Validation(Required=true)]
        public Contractorganizationapplication Platform { get; set; }

    }

}
