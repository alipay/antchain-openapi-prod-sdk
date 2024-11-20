// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushRbbInvoiceChargeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 授权类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 计费项,主租户：税号,子租户：子租户|税号
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

        // 请求id
        [NameInMap("task_request_id")]
        [Validation(Required=true)]
        public string TaskRequestId { get; set; }

        // 利润共享方
        [NameInMap("benefit_share_partner")]
        [Validation(Required=true)]
        public string BenefitSharePartner { get; set; }

        // 计费时间
        [NameInMap("fee_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FeeTime { get; set; }

        // 税号
        [NameInMap("sharding")]
        [Validation(Required=true)]
        public string Sharding { get; set; }

        // true为接收侧提交账单，false接收侧不用提交账单
        [NameInMap("receiver_submit_bill")]
        [Validation(Required=true)]
        public bool? ReceiverSubmitBill { get; set; }

    }

}
