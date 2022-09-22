// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ImportUnireleaseSolutionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // Line迭代发布Json String
        [NameInMap("solution")]
        [Validation(Required=true)]
        public string Solution { get; set; }

        // 机构列表信息；如果不填默认是所有机构统一发布
        [NameInMap("tenants")]
        [Validation(Required=false)]
        public List<string> Tenants { get; set; }

        // 银数AC工单ID
        [NameInMap("ac_id")]
        [Validation(Required=false)]
        public string AcId { get; set; }

        // 环境信息
        [NameInMap("env")]
        [Validation(Required=false)]
        public string Env { get; set; }

        // 是否是紧急发布场景
        [NameInMap("emergent")]
        [Validation(Required=false)]
        public bool? Emergent { get; set; }

    }

}
