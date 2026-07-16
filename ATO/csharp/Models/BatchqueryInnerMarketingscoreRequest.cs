// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class BatchqueryInnerMarketingscoreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 营销分查询对象
        [NameInMap("marketing_score_query_infos")]
        [Validation(Required=true)]
        public List<MarketingScoreQueryInfo> MarketingScoreQueryInfos { get; set; }

    }

}
