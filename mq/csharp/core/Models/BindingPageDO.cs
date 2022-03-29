// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // binds
    public class BindingPageDO : TeaModel {
        // binds
        [NameInMap("content")]
        [Validation(Required=false)]
        public List<BindingDO> Content { get; set; }

        // page num
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // page size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // total
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
