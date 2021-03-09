// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 解决DbSchema结构嵌套用的，其他人不要用这个，用grant
    public class DbSchemaGrant : TeaModel {
        // privilege
        [NameInMap("privilege")]
        [Validation(Required=true)]
        public string Privilege { get; set; }

        // account
        [NameInMap("account")]
        [Validation(Required=false)]
        public DatabaseAccount Account { get; set; }

    }

}
