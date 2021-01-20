// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // PageQuery
    public class PageQuery : TeaModel {
        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // page_index
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // cur_index
        [NameInMap("cur_index")]
        [Validation(Required=false)]
        public long? CurIndex { get; set; }

    }

}
