// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业舆情数量
    public class RtopCompanyOpinionCount : TeaModel {
        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 企业对应的舆情数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public int? Count { get; set; }

    }

}
