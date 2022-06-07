// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class SaveAnalysisSubmitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 分析类型
        [NameInMap("analyse_type")]
        [Validation(Required=true)]
        public string AnalyseType { get; set; }

        // 查询条件
        [NameInMap("search_condition")]
        [Validation(Required=true)]
        public SearchCondition SearchCondition { get; set; }

        // team_hash_id
        [NameInMap("team_hash_id")]
        [Validation(Required=true)]
        public string TeamHashId { get; set; }

    }

}
