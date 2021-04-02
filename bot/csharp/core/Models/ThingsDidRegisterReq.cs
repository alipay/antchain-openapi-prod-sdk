// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 实体身份注册请求结构体
    public class ThingsDidRegisterReq : TeaModel {
        // 业务编码，暂时保留，不需传入
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 信物链实体的所有者的分布式身份
        [NameInMap("owner_tenant_did")]
        [Validation(Required=false)]
        public string OwnerTenantDid { get; set; }

        // 信物链实体附加信息 不同实体身份，有不同的json组织格式...
        // 参考
        // DeviceRegisterReqModel，
        // SpaceRegisterReqModel，
        // CorporateReqModel，
        // WarehouseReqModel，
        // 
        [NameInMap("thing_extra_params")]
        [Validation(Required=false)]
        public string ThingExtraParams { get; set; }

        // 原始id，租户内同一类型实体唯一
        [NameInMap("thing_origin_id")]
        [Validation(Required=true)]
        public string ThingOriginId { get; set; }

        // 实体原始名称
        [NameInMap("thing_origin_name")]
        [Validation(Required=true)]
        public string ThingOriginName { get; set; }

        // 信物链实体身份 
        // DID_TYPE_DEVICE_ALIYUN(0): 阿里云设备 
        // DID_TYPE_DEVICE_PEGASUS(1): 链机设备 
        // DID_TYPE_DEVICE_MCU(2): MCU设备 
        // DID_TYPE_DEVICE_INTEL(3): intel设备 
        // DID_TYPE_DEVICE_DEVICE(16384): 默认设备 ... 
        // DID_TYPE_CORPORATE(65536): 组织实体 
        // DID_TYPE_WAREHOUSE(131072)：仓库实体 
        // DID_TYPE_SPACE(196608)： 空间实体
        [NameInMap("thing_type")]
        [Validation(Required=true)]
        public long? ThingType { get; set; }

        // 实体版本
        [NameInMap("thing_version")]
        [Validation(Required=true)]
        public string ThingVersion { get; set; }

        // 信物链实体的使用方的分布式身份列表
        [NameInMap("user_did")]
        [Validation(Required=false)]
        public List<string> UserDid { get; set; }

    }

}
