// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryOpsplanDetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 发布单id
        [NameInMap("time_series_id")]
        [Validation(Required=true)]
        public string TimeSeriesId { get; set; }

    }

}
