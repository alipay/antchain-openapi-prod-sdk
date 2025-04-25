// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitInnerDatadownloadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 公司名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        // 下载数据类型
        // 交易履约账单:TRADE_PROMISE_BILL
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
