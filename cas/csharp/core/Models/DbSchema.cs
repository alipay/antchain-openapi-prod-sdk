// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 查询用的DbSchema
    public class DbSchema : TeaModel {
        // charSet
        [NameInMap("char_set")]
        [Validation(Required=false)]
        public string CharSet { get; set; }

        // database
        [NameInMap("database")]
        [Validation(Required=false)]
        public Database Database { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // grants
        [NameInMap("grants")]
        [Validation(Required=true)]
        public List<DbSchemaGrant> Grants { get; set; }

        // iaas_type
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

    }

}
