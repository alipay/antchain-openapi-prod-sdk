// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api分组枚举
    public class ApiGroupTypeEnum : TeaModel {
        // API分组类型
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // api分组描述
        [NameInMap("ddescription")]
        [Validation(Required=false)]
        public string Ddescription { get; set; }

    }

}
