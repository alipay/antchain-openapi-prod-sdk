// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // nodes
    public class NodePageDO : TeaModel {
        // nodes
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<NodeDO> Content { get; set; }

        // page
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // page size
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // total
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
