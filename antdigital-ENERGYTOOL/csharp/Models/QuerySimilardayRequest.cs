// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QuerySimilardayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 运行日，格式：yyyy-mm-dd
        [NameInMap("run_date")]
        [Validation(Required=true)]
        public string RunDate { get; set; }

        // 相似日范围开始日，格式：yyyy-mm-dd
        [NameInMap("similar_start_date")]
        [Validation(Required=true)]
        public string SimilarStartDate { get; set; }

        // 相似日范围结束日，yyyy-MM-dd
        [NameInMap("similar_end_date")]
        [Validation(Required=true)]
        public string SimilarEndDate { get; set; }

        // 相似特征类型枚举，枚举范围
        // BIDDING_SPACE: 竞价空间
        // PROVINCIAL_DISPATCH_LOAD: 省调负荷
        // NEW_ENERGY_OUTPUT: 新能源出力
        // INTERCONNECTION_PLAN: 联络线计划
        [NameInMap("similar_feature_type")]
        [Validation(Required=true)]
        public string SimilarFeatureType { get; set; }

        // 省地区编码，目前仅支持江苏省
        [NameInMap("province")]
        [Validation(Required=true)]
        public string Province { get; set; }

    }

}
