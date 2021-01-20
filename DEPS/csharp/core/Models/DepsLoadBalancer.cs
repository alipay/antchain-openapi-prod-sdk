// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 负载均衡
    public class DepsLoadBalancer : TeaModel {
        // 服务实例列表
        [NameInMap("app_services")]
        [Validation(Required=false)]
        public List<AppService> AppServices { get; set; }

        // 网络带宽
        [NameInMap("bandwidth")]
        [Validation(Required=false)]
        public int? Bandwidth { get; set; }

        // iaaS在创建该资源时为其分配的唯一标示，创建中或创建失败时为空
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // 资源唯一标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 公网计费方式
        [NameInMap("internet_charge_type")]
        [Validation(Required=false)]
        public string InternetChargeType { get; set; }

        // 资源名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // VIP类型
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // 资源所属的地域id
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 
        //                     
        //                     资源所处的状态，资源状态，取值 CREATING：正在创建，CREATE_FAILED：创建失败，DELETING：正在删除，DELETED：删除成功，
        //                     DELETE_FAILED：删除失败，RESOURCE_IMPORTING：资源导入中，RESOURCE_IMPORT_FAILED：资源导入失败，RESOURCE_REMOVING：资源删除中，
        //                     RESOURCE_REMOVE_FAILED：资源删除失败，INACTIVE：未激活，STOPPING：正在停止，STARTING：正在启动，ACTIVE：已激活，LOCKED：已锁定，
        //                     RELEASING：正在释放，UPDATING：正在更新，MOUNTING：正在挂载，UMOUNTING：正在卸载  
        //                 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // vip地址
        [NameInMap("vip_address")]
        [Validation(Required=false)]
        public string VipAddress { get; set; }

        // address 类型：INTERNET, INTRANET
        [NameInMap("vip_address_type")]
        [Validation(Required=false)]
        public string VipAddressType { get; set; }

        // VIP类型
        [NameInMap("vip_type")]
        [Validation(Required=false)]
        public string VipType { get; set; }

        // vpc的id
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

        // 资源所属的可用区id
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

    }

}
