// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 表示单个云服务器
    public class Computer : TeaModel {
        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // appServiceIds
        [NameInMap("app_service_ids")]
        [Validation(Required=false)]
        public List<string> AppServiceIds { get; set; }

        // assignedAppServiceIds
        [NameInMap("assigned_app_service_ids")]
        [Validation(Required=false)]
        public List<string> AssignedAppServiceIds { get; set; }

        // 是否自动续费
        [NameInMap("auto_renew")]
        [Validation(Required=false)]
        public bool? AutoRenew { get; set; }

        // 每次自动续费的时长，当参数AutoRenew取值True时为必填。
        [NameInMap("auto_renew_period")]
        [Validation(Required=false)]
        public long? AutoRenewPeriod { get; set; }

        // bandwidth
        [NameInMap("bandwidth")]
        [Validation(Required=false)]
        public long? Bandwidth { get; set; }

        // common_image
        [NameInMap("common_image")]
        [Validation(Required=false)]
        public bool? CommonImage { get; set; }

        // vCPU数。
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // cpu_shared
        [NameInMap("cpu_shared")]
        [Validation(Required=false)]
        public bool? CpuShared { get; set; }

        // 实例创建时间
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTime { get; set; }

        // data_disk
        [NameInMap("data_disks")]
        [Validation(Required=false)]
        public List<Disk> DataDisks { get; set; }

        // 这是SIGMA模式下的专用字段，阿里云模式下无意义
        [NameInMap("deploy_mode")]
        [Validation(Required=false)]
        public string DeployMode { get; set; }

        // 服务器描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // elastic_ip
        [NameInMap("elastic_ip")]
        [Validation(Required=false)]
        public string ElasticIp { get; set; }

        // 过期时间
        [NameInMap("expired_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpiredTime { get; set; }

        // ecs iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // iaasStatus
        [NameInMap("iaas_status")]
        [Validation(Required=false)]
        public string IaasStatus { get; set; }

        // iaasType
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // 主机id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // image_iaas_id
        [NameInMap("image_iaas_id")]
        [Validation(Required=false)]
        public string ImageIaasId { get; set; }

        // image_id
        [NameInMap("image_id")]
        [Validation(Required=false)]
        public string ImageId { get; set; }

        // image_name
        [NameInMap("image_name")]
        [Validation(Required=false)]
        public string ImageName { get; set; }

        // initialized
        [NameInMap("initialized")]
        [Validation(Required=false)]
        public bool? Initialized { get; set; }

        // instanceChargeType
        [NameInMap("instance_charge_type")]
        [Validation(Required=false)]
        public string InstanceChargeType { get; set; }

        // io_optimized
        [NameInMap("io_optimized")]
        [Validation(Required=false)]
        public bool? IoOptimized { get; set; }

        // last_ops_order_id
        [NameInMap("last_ops_order_id")]
        [Validation(Required=false)]
        public string LastOpsOrderId { get; set; }

        // last_ops_type
        [NameInMap("last_ops_type")]
        [Validation(Required=false)]
        public string LastOpsType { get; set; }

        // memory
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // networkType
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // Options字段
        [NameInMap("options")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> Options { get; set; }

        // os
        [NameInMap("os")]
        [Validation(Required=false)]
        public string Os { get; set; }

        // os_bit
        [NameInMap("os_bit")]
        [Validation(Required=false)]
        public long? OsBit { get; set; }

        // os_version
        [NameInMap("os_version")]
        [Validation(Required=false)]
        public string OsVersion { get; set; }

        // paas_status
        [NameInMap("paas_status")]
        [Validation(Required=false)]
        public string PaasStatus { get; set; }

        // password
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

        // private_ip
        [NameInMap("private_ip")]
        [Validation(Required=false)]
        public string PrivateIp { get; set; }

        // providerId
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // public_ip
        [NameInMap("public_ip")]
        [Validation(Required=false)]
        public string PublicIp { get; set; }

        // regionId
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // serial_number
        [NameInMap("serial_number")]
        [Validation(Required=false)]
        public string SerialNumber { get; set; }

        // spec_iaas_id
        [NameInMap("spec_iaas_id")]
        [Validation(Required=false)]
        public string SpecIaasId { get; set; }

        // 实例状态。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // system_disk
        [NameInMap("system_disk")]
        [Validation(Required=false)]
        public Disk SystemDisk { get; set; }

        // Tags
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> Tags { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // tenantId2
        [NameInMap("tenant_id2")]
        [Validation(Required=false)]
        public string TenantId2 { get; set; }

        // CPU线程数。
        [NameInMap("threads_per_core")]
        [Validation(Required=false)]
        public long? ThreadsPerCore { get; set; }

        // utcCreate
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utcModified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

        // vpcId
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

        // vSwitchIaasId
        [NameInMap("v_switch_iaas_id")]
        [Validation(Required=false)]
        public string VSwitchIaasId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // zoneId
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

    }

}
