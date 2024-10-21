// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    // 交易履约结果消息结构
    public class TradeFulfillResult : TeaModel {
        // 履约单据号，可用于作为幂等依据
        [NameInMap("fulfill_order_no")]
        [Validation(Required=true)]
        public string FulfillOrderNo { get; set; }

        // 履约枚举，生产-PROVISION，停服-STOP，释放-RELEASE，恢复/RESUME
        // 
        [NameInMap("fulfill_type")]
        [Validation(Required=true)]
        public string FulfillType { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 主商品编码
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 履约实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

    }

}
