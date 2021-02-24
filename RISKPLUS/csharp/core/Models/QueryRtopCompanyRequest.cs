// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCompanyRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 公司ID集合
        [NameInMap("company_ids")]
        [Validation(Required=true)]
        public List<string> CompanyIds { get; set; }

        // 数据同步到公有云时间(业务上赋值当天)
        [NameInMap("update_date")]
        [Validation(Required=true)]
        public string UpdateDate { get; set; }

    }

}
