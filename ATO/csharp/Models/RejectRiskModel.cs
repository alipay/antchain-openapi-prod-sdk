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
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.00570491</para>
        /// </summary>
        [NameInMap("mob_three_score")]
        [Validation(Required=true)]
        public string MobThreeScore { get; set; }

        // 拒量模型首逾分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.62764417</para>
        /// </summary>
        [NameInMap("fpd_thirty_score")]
        [Validation(Required=true)]
        public string FpdThirtyScore { get; set; }

    }

}
