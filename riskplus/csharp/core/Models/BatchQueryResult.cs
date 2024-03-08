// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 批量决策单主体查询结果
    public class BatchQueryResult : TeaModel {
        // 查询主体
        [NameInMap("query_key")]
        [Validation(Required=true)]
        public string QueryKey { get; set; }

        // 单用户决策结果
        [NameInMap("decision")]
        [Validation(Required=true)]
        public string Decision { get; set; }

        // 输出变量信息
        [NameInMap("output_info")]
        [Validation(Required=true)]
        public BatchQueryOutputModelInfo OutputInfo { get; set; }

    }

}
