// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryResourceVpcRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 是否使用缓存进行查询，默认false，使用缓存查询
        [NameInMap("disable_cache")]
        [Validation(Required=false)]
        public bool? DisableCache { get; set; }

        // 地域identity
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // VPC的id
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

    }

}
