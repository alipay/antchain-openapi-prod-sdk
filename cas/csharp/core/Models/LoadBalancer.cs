// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // LoadBalancer
    public class LoadBalancer : TeaModel {
        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app_service_ids
        [NameInMap("app_service_ids")]
        [Validation(Required=false)]
        public List<string> AppServiceIds { get; set; }

        // assigned_app_ids
        [NameInMap("assigned_app_ids")]
        [Validation(Required=false)]
        public List<string> AssignedAppIds { get; set; }

        // assigned_app_service_ids
        [NameInMap("assigned_app_service_ids")]
        [Validation(Required=false)]
        public List<string> AssignedAppServiceIds { get; set; }

        // auto_renew
        [NameInMap("auto_renew")]
        [Validation(Required=false)]
        public bool? AutoRenew { get; set; }

        // auto_renew_period
        [NameInMap("auto_renew_period")]
        [Validation(Required=false)]
        public long? AutoRenewPeriod { get; set; }

        // bandwidth
        [NameInMap("bandwidth")]
        [Validation(Required=false)]
        public long? Bandwidth { get; set; }

        // cluster_id
        [NameInMap("cluster_id")]
        [Validation(Required=false)]
        public string ClusterId { get; set; }

        // cluster_mode
        [NameInMap("cluster_mode")]
        [Validation(Required=false)]
        public bool? ClusterMode { get; set; }

        // domains
        [NameInMap("domains")]
        [Validation(Required=false)]
        public List<string> Domains { get; set; }

        // iaas_id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // iaas_type
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // lb id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // internet_charge_type
        [NameInMap("internet_charge_type")]
        [Validation(Required=false)]
        public string InternetChargeType { get; set; }

        // lb名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // network_type
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // provider_id
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // regionId
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // scope
        [NameInMap("scope")]
        [Validation(Required=false)]
        public Scope Scope { get; set; }

        // share_mode
        [NameInMap("share_mode")]
        [Validation(Required=false)]
        public bool? ShareMode { get; set; }

        // lb状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // vip_addresses
        [NameInMap("vip_addresses")]
        [Validation(Required=false)]
        public List<string> VipAddresses { get; set; }

        // vip_address_type
        [NameInMap("vip_address_type")]
        [Validation(Required=false)]
        public string VipAddressType { get; set; }

        // vip_type
        [NameInMap("vip_type")]
        [Validation(Required=false)]
        public string VipType { get; set; }

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

        // zone_id
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // options，扩展字段
        [NameInMap("options")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> Options { get; set; }

        // load_balancer_spec
        [NameInMap("load_balancer_spec")]
        [Validation(Required=false)]
        public string LoadBalancerSpec { get; set; }

    }

}
