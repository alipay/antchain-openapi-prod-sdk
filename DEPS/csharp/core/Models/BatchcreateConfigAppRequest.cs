// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class BatchcreateConfigAppRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要创建的应用参数列表
        [NameInMap("items")]
        [Validation(Required=false)]
        public List<AppParam> Items { get; set; }

    }

}
