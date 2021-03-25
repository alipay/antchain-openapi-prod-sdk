// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyJusticeMediationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 机构码 由蚂蚁分配
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 法院代码 由蚂蚁提供
        [NameInMap("court_code")]
        [Validation(Required=true)]
        public string CourtCode { get; set; }

        // 案件内容 JsonString 格式{"agencyRelations":[],"agents":[],"caseInfo":{},"litigants":{}} 
        [NameInMap("case_body")]
        [Validation(Required=true)]
        public string CaseBody { get; set; }

    }

}
