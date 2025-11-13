// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerAuthagreementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 主体类型,如MERCHNAT/USER
        [NameInMap("subject_type")]
        [Validation(Required=true)]
        public string SubjectType { get; set; }

        // 协议code
        [NameInMap("agreement_code")]
        [Validation(Required=true)]
        public string AgreementCode { get; set; }

    }

}
