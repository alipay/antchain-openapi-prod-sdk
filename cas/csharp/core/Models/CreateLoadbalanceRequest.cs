// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateLoadbalanceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 负载均衡实例的网络类型。有 INTERNET 和 INTRANET
        [NameInMap("address_type")]
        [Validation(Required=false)]
        public string AddressType { get; set; }

        // app id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app service id
        [NameInMap("app_service_id")]
        [Validation(Required=false)]
        public string AppServiceId { get; set; }

        // cluster_mode
        [NameInMap("cluster_mode")]
        [Validation(Required=false)]
        public bool? ClusterMode { get; set; }

        // 	
        // 创建的实例数量。默认为 1 台
        [NameInMap("instance_count")]
        [Validation(Required=false)]
        public long? InstanceCount { get; set; }

        // 公网类型实例的付费方式。取值：
        // PAY_BY_BANDWIDTH：按带宽计费。
        // PAY_BY_TRAFFIC：按流量计费（默认值）。
        [NameInMap("internet_charge_type")]
        [Validation(Required=false)]
        public string InternetChargeType { get; set; }

        // listener JSON Array
        [NameInMap("listeners")]
        [Validation(Required=false)]
        public List<string> Listeners { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 共享模式
        [NameInMap("share_mode")]
        [Validation(Required=true)]
        public bool? ShareMode { get; set; }

        // ALB模式专用
        [NameInMap("vip_type")]
        [Validation(Required=false)]
        public string VipType { get; set; }

        // VPC类型的实例，需要指定虚拟交换机ID。
        [NameInMap("v_switch_id")]
        [Validation(Required=false)]
        public string VSwitchId { get; set; }

        // 工作空间
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 可用区
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // 负载均衡实例的规格。取值：
        // 
        // slb.s1.small
        // slb.s2.small
        // slb.s2.medium
        // slb.s3.small
        // slb.s3.medium
        // slb.s3.large
        // 每个地域支持的规格不同。
        // 
        // 目前支持性能保障型实例的地域有：华北 1（青岛）、华北 2（北京）、华东 1（杭州）、华东 2（上海）、华南 1（深圳）、华北 3（张家口）、华北 5 （呼和浩特）、亚太东南 1（新加坡）、英国（伦敦）、欧洲中部 1（法兰克福）、亚太东南 2（悉尼）、亚太东南 3（吉隆坡）、中东东部 1（迪拜）、亚太东南 5（雅加达）、美西 1（硅谷）、亚太南部 1（孟买）、亚太东北 1（东京）、中国香港和美东 1（弗吉尼亚）
        [NameInMap("load_balancer_spec")]
        [Validation(Required=false)]
        public string LoadBalancerSpec { get; set; }

    }

}
