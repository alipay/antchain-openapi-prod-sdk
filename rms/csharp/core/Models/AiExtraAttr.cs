// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AiExtraAttr
    public class AiExtraAttr : TeaModel {
        // time_range_thres
        [NameInMap("time_range_thres")]
        [Validation(Required=true)]
        public string TimeRangeThres { get; set; }

        // abnormal_value_thres
        [NameInMap("abnormal_value_thres")]
        [Validation(Required=true)]
        public string AbnormalValueThres { get; set; }

        // value_range_thres
        [NameInMap("value_range_thres")]
        [Validation(Required=true)]
        public string ValueRangeThres { get; set; }

        // algo_score_thres
        [NameInMap("algo_score_thres")]
        [Validation(Required=true)]
        public string AlgoScoreThres { get; set; }

    }

}
