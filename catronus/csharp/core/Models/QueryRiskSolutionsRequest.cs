// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class QueryRiskSolutionsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 风险解决方案名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 风险ID
        [NameInMap("risk_id")]
        [Validation(Required=false)]
        public string RiskId { get; set; }

        // 当前页
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
