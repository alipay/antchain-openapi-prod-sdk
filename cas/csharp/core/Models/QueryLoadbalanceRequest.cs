// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryLoadbalanceRequest : TeaModel {
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

        // cluster_ids
        [NameInMap("cluster_ids")]
        [Validation(Required=false)]
        public List<string> ClusterIds { get; set; }

        // cluster_mode
        [NameInMap("cluster_mode")]
        [Validation(Required=false)]
        public bool? ClusterMode { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // domains
        [NameInMap("domains")]
        [Validation(Required=false)]
        public List<string> Domains { get; set; }

        // health_levels 
        [NameInMap("health_levels")]
        [Validation(Required=false)]
        public List<string> HealthLevels { get; set; }

        // iaas_ids
        [NameInMap("iaas_ids")]
        [Validation(Required=false)]
        public List<string> IaasIds { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 网络类型
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // share_mode
        [NameInMap("share_mode")]
        [Validation(Required=false)]
        public bool? ShareMode { get; set; }

        // lb状态
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // vip地址
        [NameInMap("vip_addresses")]
        [Validation(Required=false)]
        public List<string> VipAddresses { get; set; }

        // vip地址类型
        [NameInMap("vip_address_type")]
        [Validation(Required=false)]
        public string VipAddressType { get; set; }

        // vip类型
        [NameInMap("vip_type")]
        [Validation(Required=false)]
        public string VipType { get; set; }

        // vpc_ids
        [NameInMap("vpc_ids")]
        [Validation(Required=false)]
        public List<string> VpcIds { get; set; }

        // vswitch_iaas_ids
        [NameInMap("vswitch_iaas_ids")]
        [Validation(Required=false)]
        public List<string> VswitchIaasIds { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
