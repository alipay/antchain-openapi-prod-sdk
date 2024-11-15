// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class QueryTenantRatelimitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户id
        [NameInMap("tenant_id_list")]
        [Validation(Required=true)]
        public List<string> TenantIdList { get; set; }

        // api名
        [NameInMap("api_name_list")]
        [Validation(Required=true)]
        public List<string> ApiNameList { get; set; }

    }

}
