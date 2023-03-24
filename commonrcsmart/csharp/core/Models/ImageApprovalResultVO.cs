// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMONRCSMART.Models
{
    // 通用版图片审核结果
    public class ImageApprovalResultVO : TeaModel {
        // 机审结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 图片审核结果的url
        [NameInMap("result_url")]
        [Validation(Required=false)]
        public string ResultUrl { get; set; }

        // 审核结果详情
        [NameInMap("risk_detail_vo_list")]
        [Validation(Required=false)]
        public List<ContentRiskDetailVO> RiskDetailVoList { get; set; }

    }

}
