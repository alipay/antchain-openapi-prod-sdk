// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class UpdateServiceaccountRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 服务账号别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 服务账号描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 服务账号名称，与服务账号ID任选其一传入
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 服务账号ID
        [NameInMap("service_account_id")]
        [Validation(Required=false)]
        public string ServiceAccountId { get; set; }

    }

}
