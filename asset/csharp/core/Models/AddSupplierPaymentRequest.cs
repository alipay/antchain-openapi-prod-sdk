// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ASSET.Models
{
    public class AddSupplierPaymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 云上租户id 
        [NameInMap("cloud_tenant_id")]
        [Validation(Required=true)]
        public string CloudTenantId { get; set; }

        // 打款金额，单位分
        [NameInMap("payment_amount")]
        [Validation(Required=true)]
        public long? PaymentAmount { get; set; }

        // 服务商名称 - 即云租户名称，比如南京飞翰
        [NameInMap("supplier_name")]
        [Validation(Required=true)]
        public string SupplierName { get; set; }

        // 打款日期
        [NameInMap("payment_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PaymentDate { get; set; }

        // 唯一请求id
        [NameInMap("request_unique_id")]
        [Validation(Required=true)]
        public string RequestUniqueId { get; set; }

    }

}
