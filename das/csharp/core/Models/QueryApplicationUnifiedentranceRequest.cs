// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryApplicationUnifiedentranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需求id
        [NameInMap("demand_id")]
        [Validation(Required=true)]
        public string DemandId { get; set; }

        // 授权协议索引
        [NameInMap("file_index")]
        [Validation(Required=false)]
        public string FileIndex { get; set; }

        // 整个需求的入参，map json
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

    }

}
