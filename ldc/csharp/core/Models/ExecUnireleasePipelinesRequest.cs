// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ExecUnireleasePipelinesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 解决方案ID
        [NameInMap("solution_id")]
        [Validation(Required=true)]
        public string SolutionId { get; set; }

        // 租户/机构名称列表，不填默认当前机构所有租户
        [NameInMap("tenants")]
        [Validation(Required=false)]
        public List<string> Tenants { get; set; }

    }

}
