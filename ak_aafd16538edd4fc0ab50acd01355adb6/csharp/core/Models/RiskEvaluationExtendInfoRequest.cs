// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_aafd16538edd4fc0ab50acd01355adb6.Models
{
    // 扩展信息
    public class RiskEvaluationExtendInfoRequest : TeaModel {
        // 协议集合
        [NameInMap("agreement_list")]
        [Validation(Required=true)]
        public List<RiskEvaluationAgreementExtRequest> AgreementList { get; set; }

        // 地区请求
        [NameInMap("district_ext")]
        [Validation(Required=true)]
        public RiskEvaluationDistrictExtRequest DistrictExt { get; set; }

    }

}
