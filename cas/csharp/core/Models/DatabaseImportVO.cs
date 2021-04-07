// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // DatabaseImportVO
    public class DatabaseImportVO : TeaModel {
        // iaas_id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // engine
        [NameInMap("engine")]
        [Validation(Required=false)]
        public string Engine { get; set; }

        // net_type
        [NameInMap("net_type")]
        [Validation(Required=false)]
        public string NetType { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // importInfo
        [NameInMap("import_info")]
        [Validation(Required=true)]
        public ImportVO ImportInfo { get; set; }

    }

}
