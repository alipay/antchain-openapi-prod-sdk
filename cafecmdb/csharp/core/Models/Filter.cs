// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    // 联合查询时的过滤条件
    public class Filter : TeaModel {
        // join_model_id
        [NameInMap("join_model_id")]
        [Validation(Required=true)]
        public string JoinModelId { get; set; }

        // conditions
        [NameInMap("conditions")]
        [Validation(Required=true)]
        public List<Condition> Conditions { get; set; }

    }

}
