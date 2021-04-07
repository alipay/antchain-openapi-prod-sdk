// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ImportDatabaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // database iaas ids
        [NameInMap("database_ids")]
        [Validation(Required=true)]
        public List<string> DatabaseIds { get; set; }

        // database 类型，默认为 DATABASE 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 工作空间
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
