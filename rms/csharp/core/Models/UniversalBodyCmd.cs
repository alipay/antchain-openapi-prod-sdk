// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // UniversalBodyCmd
    public class UniversalBodyCmd : TeaModel {
        // body
        [NameInMap("body")]
        [Validation(Required=true)]
        public string Body { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // model_name
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // op
        [NameInMap("op")]
        [Validation(Required=true)]
        public string Op { get; set; }

        // parse_long_text
        [NameInMap("parse_long_text")]
        [Validation(Required=true)]
        public bool? ParseLongText { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // page_index
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // cur_index
        [NameInMap("cur_index")]
        [Validation(Required=true)]
        public long? CurIndex { get; set; }

    }

}
