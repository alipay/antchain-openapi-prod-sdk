// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // Api状态
    public class StatusEnum : TeaModel {
        // api状态码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // api状态码描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

    }

}
