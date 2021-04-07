// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryResourceSecuritygroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // disable cache
        [NameInMap("disable_cache")]
        [Validation(Required=false)]
        public bool? DisableCache { get; set; }

        // 地域identity
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 安全组ID。
        [NameInMap("security_group_id")]
        [Validation(Required=false)]
        public string SecurityGroupId { get; set; }

        // 安全组所在的专有网络ID。
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

    }

}
