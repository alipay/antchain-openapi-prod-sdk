// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QuerySingledimquotaInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // single_dim_groups
        [NameInMap("single_dim_groups")]
        [Validation(Required=true)]
        public List<SingleDimGroup> SingleDimGroups { get; set; }

    }

}
