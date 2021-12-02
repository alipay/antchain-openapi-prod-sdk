// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    public class QueryItemRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // display_fields
        [NameInMap("display_fields")]
        [Validation(Required=false)]
        public List<string> DisplayFields { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // page_number
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // sort_fields
        [NameInMap("sort_fields")]
        [Validation(Required=false)]
        public List<string> SortFields { get; set; }

        // conditions
        [NameInMap("conditions")]
        [Validation(Required=true)]
        public List<Condition> Conditions { get; set; }

        // filter
        [NameInMap("filter")]
        [Validation(Required=false)]
        public Filter Filter { get; set; }

        // model_id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

    }

}
