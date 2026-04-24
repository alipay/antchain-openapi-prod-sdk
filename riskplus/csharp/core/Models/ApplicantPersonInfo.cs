// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 申请人信息
    public class ApplicantPersonInfo : TeaModel {
        // 申请人姓名
        [NameInMap("applicant_name")]
        [Validation(Required=false)]
        public string ApplicantName { get; set; }

        // 申请人身份证号码
        [NameInMap("id_no")]
        [Validation(Required=false)]
        public string IdNo { get; set; }

    }

}
