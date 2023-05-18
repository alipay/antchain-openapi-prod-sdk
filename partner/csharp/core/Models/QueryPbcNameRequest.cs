// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    public class QueryPbcNameRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 省份名称
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

        // 城市名称
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 银行机构id
        [NameInMap("inst_id")]
        [Validation(Required=true)]
        public string InstId { get; set; }

        // 支行名称关键字
        [NameInMap("branch_name")]
        [Validation(Required=true)]
        public string BranchName { get; set; }

        // 租户来源-用于租户间功能和数据的隔离
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

    }

}
