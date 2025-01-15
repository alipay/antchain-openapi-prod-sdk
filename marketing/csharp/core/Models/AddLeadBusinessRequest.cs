// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    public class AddLeadBusinessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 商机信息
        [NameInMap("request")]
        [Validation(Required=true)]
        public List<BusinessRequest> Request { get; set; }

        // 线索服务化，多租户模型
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

    }

}
