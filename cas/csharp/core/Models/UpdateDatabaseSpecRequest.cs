// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateDatabaseSpecRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // db paas id
        [NameInMap("database_sequences")]
        [Validation(Required=true)]
        public List<string> DatabaseSequences { get; set; }

        // 实例规格 id
        [NameInMap("spec_id")]
        [Validation(Required=true)]
        public string SpecId { get; set; }

        // 存储空间大小
        [NameInMap("storage_size")]
        [Validation(Required=true)]
        public long? StorageSize { get; set; }

    }

}
