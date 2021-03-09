// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 数据库
    public class Database : TeaModel {
        // app_ids
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

        // app_service_ids
        [NameInMap("app_service_ids")]
        [Validation(Required=false)]
        public List<string> AppServiceIds { get; set; }

        // assignedApps
        [NameInMap("assigned_apps")]
        [Validation(Required=false)]
        public List<AssignedApp> AssignedApps { get; set; }

        // assigned_app_service_ids
        [NameInMap("assigned_app_service_ids")]
        [Validation(Required=false)]
        public List<string> AssignedAppServiceIds { get; set; }

        // autoRenew
        [NameInMap("auto_renew")]
        [Validation(Required=false)]
        public bool? AutoRenew { get; set; }

        // auto_renew_period
        [NameInMap("auto_renew_period")]
        [Validation(Required=false)]
        public long? AutoRenewPeriod { get; set; }

        // connection_address
        [NameInMap("connection_address")]
        [Validation(Required=false)]
        public string ConnectionAddress { get; set; }

        // cpu
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // engine
        [NameInMap("engine")]
        [Validation(Required=false)]
        public string Engine { get; set; }

        // engine_version
        [NameInMap("engine_version")]
        [Validation(Required=false)]
        public string EngineVersion { get; set; }

        // iaasId
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // iaas_type
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // master_zone_id
        [NameInMap("master_zone_id")]
        [Validation(Required=false)]
        public string MasterZoneId { get; set; }

        // max_connections
        [NameInMap("max_connections")]
        [Validation(Required=false)]
        public long? MaxConnections { get; set; }

        // max_iops
        [NameInMap("max_iops")]
        [Validation(Required=false)]
        public long? MaxIops { get; set; }

        // memory
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // network_type
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // net_type
        [NameInMap("net_type")]
        [Validation(Required=false)]
        public string NetType { get; set; }

        // port
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // shared_workspace_ids
        [NameInMap("shared_workspace_ids")]
        [Validation(Required=false)]
        public List<string> SharedWorkspaceIds { get; set; }

        // spec_iaas_id
        [NameInMap("spec_iaas_id")]
        [Validation(Required=false)]
        public string SpecIaasId { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // storage
        [NameInMap("storage")]
        [Validation(Required=false)]
        public long? Storage { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // vpc_id
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

        // v_switch_iaas_id
        [NameInMap("v_switch_iaas_id")]
        [Validation(Required=false)]
        public string VSwitchIaasId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
