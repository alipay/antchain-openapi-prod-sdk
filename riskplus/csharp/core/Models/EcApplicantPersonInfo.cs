// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-申请人信息
    public class EcApplicantPersonInfo : TeaModel {
        // 如果合作方传输，会在我行H5进件页面反显展示
        [NameInMap("applicant_name")]
        [Validation(Required=false)]
        public string ApplicantName { get; set; }

        // 申请人身份证号码
        [NameInMap("id_no")]
        [Validation(Required=false)]
        public string IdNo { get; set; }

    }

}
