// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateDatabaseSchemaRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // char_set
        [NameInMap("char_set")]
        [Validation(Required=true)]
        public string CharSet { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // grant_map
        [NameInMap("grant_map")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> GrantMap { get; set; }

        // 数据库id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
