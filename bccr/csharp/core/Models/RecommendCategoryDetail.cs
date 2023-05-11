// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 推荐分类信息
    public class RecommendCategoryDetail : TeaModel {
        // 推荐分类类型
        [NameInMap("recommend_work_category")]
        [Validation(Required=true)]
        public string RecommendWorkCategory { get; set; }

        // 作品类型相似度，保留2位小数
        [NameInMap("category_similar_ratio")]
        [Validation(Required=true)]
        public string CategorySimilarRatio { get; set; }

        // 作品类型风险等级
        [NameInMap("category_risk_rank")]
        [Validation(Required=false)]
        public string CategoryRiskRank { get; set; }

    }

}
