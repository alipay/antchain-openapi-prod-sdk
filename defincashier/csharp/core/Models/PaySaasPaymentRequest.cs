// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    public class PaySaasPaymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // json请求参数,示例超出限制，完整字段见下文
        // {"out_order_id":"","out_payer_id":{"reference_id_type":"","reference_id":""},"out_payee_id":{"reference_id_type":"","reference_id":""},"order_pay_time":"","payer_detail":{"payer_amount":"","payer_currency":"","account":{"inst_id":"","account_no":"","account_name":"","offical_name":"","offical_number":""},"pay_mode":""},"platform_member_id":""}
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

        // 版本号
        [NameInMap("service_version")]
        [Validation(Required=true)]
        public string ServiceVersion { get; set; }

    }

}
