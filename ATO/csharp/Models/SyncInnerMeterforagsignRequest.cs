// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncInnerMeterforagsignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户租户id
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=32)]
        public string MerchantTenantId { get; set; }

        // 商户社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=199)]
        public string MerchantId { get; set; }

        // 计量上报Code
        [NameInMap("meter_product_code")]
        [Validation(Required=true, MaxLength=64)]
        public string MeterProductCode { get; set; }

        // 系统名字
        [NameInMap("sys_name")]
        [Validation(Required=true, MaxLength=32)]
        public string SysName { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=49)]
        public string OrderId { get; set; }

        // 合同编号
        [NameInMap("sign_no")]
        [Validation(Required=true, MaxLength=64)]
        public string SignNo { get; set; }

    }

}
