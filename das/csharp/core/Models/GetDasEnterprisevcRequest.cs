// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class GetDasEnterprisevcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权实例ID
        [NameInMap("auth_instance_id")]
        [Validation(Required=true)]
        public string AuthInstanceId { get; set; }

        // 授权企业信息
        [NameInMap("auth_person_enterprise_info")]
        [Validation(Required=true)]
        public AuthPersonEnterpriseInfo AuthPersonEnterpriseInfo { get; set; }

    }

}
