// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 收入评估服务B结果对象
    public class SocialIncomeEvaluationFacade : TeaModel {
        // 查询结果
        [NameInMap("score_result")]
        [Validation(Required=true)]
        public string ScoreResult { get; set; }

        // 收入评分
        [NameInMap("range_score")]
        [Validation(Required=false)]
        public string RangeScore { get; set; }

        // 历史稳定性评估
        [NameInMap("history_score")]
        [Validation(Required=false)]
        public string HistoryScore { get; set; }

        // 近期稳定性评估
        [NameInMap("stability_score")]
        [Validation(Required=false)]
        public string StabilityScore { get; set; }

    }

}
