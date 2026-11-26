// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ListIotsuccessProductQuotaConsumptionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 枚举:DAY,WEEK,MONTH
        [NameInMap("granularity")]
        [Validation(Required=true)]
        public string Granularity { get; set; }

    }

}
