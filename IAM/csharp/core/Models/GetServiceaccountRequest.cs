// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetServiceaccountRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 服务账号名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 服务账号ID
        [NameInMap("service_account_id")]
        [Validation(Required=false)]
        public string ServiceAccountId { get; set; }

    }

}
