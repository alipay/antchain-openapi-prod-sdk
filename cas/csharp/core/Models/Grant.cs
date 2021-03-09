// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 数据库Grant
    public class Grant : TeaModel {
        // account
        [NameInMap("account")]
        [Validation(Required=true)]
        public DatabaseAccount Account { get; set; }

        // privilege
        [NameInMap("privilege")]
        [Validation(Required=true)]
        public string Privilege { get; set; }

        // schema
        [NameInMap("schema")]
        [Validation(Required=true)]
        public DbSchema Schema { get; set; }

    }

}
