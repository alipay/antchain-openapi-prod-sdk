// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class AuthDatabaseAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // schema_id
        [NameInMap("schema_id")]
        [Validation(Required=true)]
        public string SchemaId { get; set; }

        // privilege
        [NameInMap("privilege")]
        [Validation(Required=true)]
        public string Privilege { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}
