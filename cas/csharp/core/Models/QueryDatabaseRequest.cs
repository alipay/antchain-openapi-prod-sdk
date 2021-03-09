// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryDatabaseRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_ids
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

        // app_service_ids
        [NameInMap("app_service_ids")]
        [Validation(Required=false)]
        public List<string> AppServiceIds { get; set; }

        // connection_addresses
        [NameInMap("connection_addresses")]
        [Validation(Required=false)]
        public List<string> ConnectionAddresses { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // engines
        [NameInMap("engines")]
        [Validation(Required=false)]
        public List<string> Engines { get; set; }

        // engine_versions
        [NameInMap("engine_versions")]
        [Validation(Required=false)]
        public List<string> EngineVersions { get; set; }

        // include_shared
        [NameInMap("include_shared")]
        [Validation(Required=false)]
        public bool? IncludeShared { get; set; }

        // master_ids
        [NameInMap("master_ids")]
        [Validation(Required=false)]
        public List<string> MasterIds { get; set; }

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

        // max_port
        [NameInMap("max_port")]
        [Validation(Required=false)]
        public long? MaxPort { get; set; }

        // max_storage
        [NameInMap("max_storage")]
        [Validation(Required=false)]
        public long? MaxStorage { get; set; }

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

        // min_port
        [NameInMap("min_port")]
        [Validation(Required=false)]
        public long? MinPort { get; set; }

        // min_storage
        [NameInMap("min_storage")]
        [Validation(Required=false)]
        public long? MinStorage { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // network_type
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // net_type
        [NameInMap("net_type")]
        [Validation(Required=false)]
        public string NetType { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // spec_iaas_ids
        [NameInMap("spec_iaas_ids")]
        [Validation(Required=false)]
        public List<string> SpecIaasIds { get; set; }

        // statuses
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // types
        [NameInMap("types")]
        [Validation(Required=false)]
        public List<string> Types { get; set; }

        // vpc_ids
        [NameInMap("vpc_ids")]
        [Validation(Required=false)]
        public List<string> VpcIds { get; set; }

        // v_switch_iaas_ids
        [NameInMap("v_switch_iaas_ids")]
        [Validation(Required=false)]
        public List<string> VSwitchIaasIds { get; set; }

        // workspace_ids
        [NameInMap("workspace_ids")]
        [Validation(Required=false)]
        public List<string> WorkspaceIds { get; set; }

    }

}
