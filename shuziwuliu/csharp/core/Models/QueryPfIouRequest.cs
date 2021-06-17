// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryPfIouRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true, MaxLength=20)]
        public string ProjectId { get; set; }

        // 融资主体Did
        [NameInMap("financing_subject_did")]
        [Validation(Required=true, MaxLength=16)]
        public string FinancingSubjectDid { get; set; }

        // 支用Id
        [NameInMap("financing_id")]
        [Validation(Required=true, MaxLength=32)]
        public string FinancingId { get; set; }

    }

}
