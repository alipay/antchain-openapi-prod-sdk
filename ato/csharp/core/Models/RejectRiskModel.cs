// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 拒量模型
    public class RejectRiskModel : TeaModel {
        //  拒量模型捞回分
        [NameInMap("mob_three_score")]
        [Validation(Required=true)]
        public string MobThreeScore { get; set; }

        // 拒量模型首逾分
        [NameInMap("fpd_thirty_score")]
        [Validation(Required=true)]
        public string FpdThirtyScore { get; set; }

    }

}
