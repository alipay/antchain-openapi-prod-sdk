// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryDatabaseSpecRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // custom_storage
        [NameInMap("custom_storage")]
        [Validation(Required=false)]
        public bool? CustomStorage { get; set; }

        // engines
        [NameInMap("engines")]
        [Validation(Required=false)]
        public List<string> Engines { get; set; }

        // engine_versions
        [NameInMap("engine_versions")]
        [Validation(Required=false)]
        public List<string> EngineVersions { get; set; }

        // iaas_ids
        [NameInMap("iaas_ids")]
        [Validation(Required=false)]
        public List<string> IaasIds { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<string> Ids { get; set; }

        // max_cpu
        [NameInMap("max_cpu")]
        [Validation(Required=false)]
        public long? MaxCpu { get; set; }

        // max_max_connections
        [NameInMap("max_max_connections")]
        [Validation(Required=false)]
        public long? MaxMaxConnections { get; set; }

        // max_max_iops
        [NameInMap("max_max_iops")]
        [Validation(Required=false)]
        public long? MaxMaxIops { get; set; }

        // max_memory
        [NameInMap("max_memory")]
        [Validation(Required=false)]
        public long? MaxMemory { get; set; }

        // min_cpu
        [NameInMap("min_cpu")]
        [Validation(Required=false)]
        public long? MinCpu { get; set; }

        // min_max_connections
        [NameInMap("min_max_connections")]
        [Validation(Required=false)]
        public long? MinMaxConnections { get; set; }

        // min_max_iops
        [NameInMap("min_max_iops")]
        [Validation(Required=false)]
        public long? MinMaxIops { get; set; }

        // min_memory
        [NameInMap("min_memory")]
        [Validation(Required=false)]
        public long? MinMemory { get; set; }

        // pageSize
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // types
        [NameInMap("types")]
        [Validation(Required=false)]
        public List<string> Types { get; set; }

        // provider_ids
        [NameInMap("provider_ids")]
        [Validation(Required=false)]
        public List<string> ProviderIds { get; set; }

        // enable
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

        // iaas_types
        [NameInMap("iaas_types")]
        [Validation(Required=false)]
        public List<string> IaasTypes { get; set; }

    }

}
