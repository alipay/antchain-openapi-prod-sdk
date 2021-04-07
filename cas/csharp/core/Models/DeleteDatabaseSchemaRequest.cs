// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteDatabaseSchemaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 欲删除的的 schema id
        [NameInMap("schema_sequence")]
        [Validation(Required=true)]
        public string SchemaSequence { get; set; }

    }

}
