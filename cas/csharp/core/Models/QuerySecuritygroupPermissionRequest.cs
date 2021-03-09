// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QuerySecuritygroupPermissionRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // securityGroupId
        [NameInMap("security_group_id")]
        [Validation(Required=true)]
        public string SecurityGroupId { get; set; }

        // autoRefresh
        [NameInMap("auto_refresh")]
        [Validation(Required=false)]
        public bool? AutoRefresh { get; set; }

        // nicType
        [NameInMap("nic_type")]
        [Validation(Required=false)]
        public string NicType { get; set; }

        // direction
        [NameInMap("direction")]
        [Validation(Required=false)]
        public string Direction { get; set; }

    }

}
