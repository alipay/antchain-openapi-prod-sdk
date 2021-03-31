// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryPfQuotaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=true, MaxLength=20)]
        public string CertNo { get; set; }

        // 证件类型;050 统一社会信用证代码
        [NameInMap("cert_type")]
        [Validation(Required=true, MaxLength=3)]
        public string CertType { get; set; }

        // 银行端客户号
        [NameInMap("customer_no")]
        [Validation(Required=true, MaxLength=20)]
        public string CustomerNo { get; set; }

        // 融资主体did
        [NameInMap("financing_subject_did")]
        [Validation(Required=true)]
        public string FinancingSubjectDid { get; set; }

    }

}
