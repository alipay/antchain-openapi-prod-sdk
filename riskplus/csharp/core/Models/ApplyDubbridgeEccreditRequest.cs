// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgeEccreditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景码
        [NameInMap("business_scene")]
        [Validation(Required=true, MaxLength=64)]
        public string BusinessScene { get; set; }

        // 外部申请编号
        [NameInMap("third_apply_no")]
        [Validation(Required=true, MaxLength=64)]
        public string ThirdApplyNo { get; set; }

        // 申请人信息
        [NameInMap("applicant_person_info")]
        [Validation(Required=false)]
        public ApplicantPersonInfo ApplicantPersonInfo { get; set; }

    }

}
