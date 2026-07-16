// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CountInnerAgreementterminateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户超时类型
        [NameInMap("merchant_handle_duration_type")]
        [Validation(Required=false)]
        public string MerchantHandleDurationType { get; set; }

        // 订单ID
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // terminateApplyId
        [NameInMap("terminate_apply_id")]
        [Validation(Required=false)]
        public string TerminateApplyId { get; set; }

        // 解约申请开始时间
        [NameInMap("gmt_terminate_apply_start_time")]
        [Validation(Required=false)]
        public string GmtTerminateApplyStartTime { get; set; }

        // 解约申请结束时间
        [NameInMap("gmt_terminate_apply_end_time")]
        [Validation(Required=false)]
        public string GmtTerminateApplyEndTime { get; set; }

    }

}
