// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CheckQuotaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 检查的值
        [NameInMap("dim_groups")]
        [Validation(Required=true)]
        public List<SingleDimGroup> DimGroups { get; set; }

    }

}
