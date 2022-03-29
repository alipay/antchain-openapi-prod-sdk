// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // msgtype
    public class MsgTypePageDO : TeaModel {
        // msgtypes
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<MsgTypeDO> Content { get; set; }

        // page_num
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // total
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
