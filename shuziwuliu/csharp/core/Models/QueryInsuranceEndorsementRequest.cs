// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryInsuranceEndorsementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批单申请号
        [NameInMap("endorsement_apply_no")]
        [Validation(Required=true)]
        public string EndorsementApplyNo { get; set; }

        // 批单申请编码
        [NameInMap("endorsement_apply_code")]
        [Validation(Required=false)]
        public string EndorsementApplyCode { get; set; }

    }

}
