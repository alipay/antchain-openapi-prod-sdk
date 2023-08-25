// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 收入评估服务A结果
    public class PersonalIncomeEvaluationFacade : TeaModel {
        // 查询结果
        [NameInMap("score_result")]
        [Validation(Required=true)]
        public string ScoreResult { get; set; }

        // 收入评分
        [NameInMap("income_score")]
        [Validation(Required=false)]
        public string IncomeScore { get; set; }

    }

}
