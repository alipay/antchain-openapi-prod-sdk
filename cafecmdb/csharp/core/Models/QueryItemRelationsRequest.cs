// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    public class QueryItemRelationsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标模型id
        [NameInMap("destination_model_id")]
        [Validation(Required=true)]
        public string DestinationModelId { get; set; }

        // item_id
        [NameInMap("item_id")]
        [Validation(Required=true)]
        public string ItemId { get; set; }

        // 1
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // page_number
        [NameInMap("page_number")]
        [Validation(Required=true)]
        public long? PageNumber { get; set; }

        // display_fields
        [NameInMap("display_fields")]
        [Validation(Required=false)]
        public List<string> DisplayFields { get; set; }

        // 上钻表示查询拓扑目标为自己的上级资源，反之则是查询以自己为源目标的下级资源
        [NameInMap("drill_up")]
        [Validation(Required=false)]
        public bool? DrillUp { get; set; }

    }

}
