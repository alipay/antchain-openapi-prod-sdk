// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class VerifyBclContractmetricRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接口使用场景
        // - RESOURCE_CHECK, 权限与资源量校验
        // - METRIC，签署达到终态，资源量扣减
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

        // 合同流程id，该接口返回的，该流程均为已完成
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

        // 合同流程状态
        [NameInMap("flow_status")]
        [Validation(Required=false)]
        public long? FlowStatus { get; set; }

        // 租赁宝订单id
        [NameInMap("bcl_order_id")]
        [Validation(Required=true)]
        public string BclOrderId { get; set; }

        // 8位租户英文id
        [NameInMap("contract_tenant_id")]
        [Validation(Required=true)]
        public string ContractTenantId { get; set; }

        // RESOURCE_CHECK必填，代扣总金额,单位为分
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 总期数，12
        [NameInMap("total_period")]
        [Validation(Required=false)]
        public long? TotalPeriod { get; set; }

    }

}
