// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // DatabaseSpec
    public class DatabaseSpec : TeaModel {
        // cpu
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // custom_storage
        [NameInMap("custom_storage")]
        [Validation(Required=false)]
        public bool? CustomStorage { get; set; }

        // engine
        [NameInMap("engine")]
        [Validation(Required=false)]
        public string Engine { get; set; }

        // engine_version
        [NameInMap("engine_version")]
        [Validation(Required=false)]
        public List<string> EngineVersion { get; set; }

        // iaas_id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // max_connections
        [NameInMap("max_connections")]
        [Validation(Required=false)]
        public long? MaxConnections { get; set; }

        // max_iops
        [NameInMap("max_iops")]
        [Validation(Required=false)]
        public long? MaxIops { get; set; }

        // max_storage
        [NameInMap("max_storage")]
        [Validation(Required=false)]
        public long? MaxStorage { get; set; }

        // memory
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // min_storage
        [NameInMap("min_storage")]
        [Validation(Required=false)]
        public long? MinStorage { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // supported_storages
        [NameInMap("supported_storages")]
        [Validation(Required=false)]
        public List<long?> SupportedStorages { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
