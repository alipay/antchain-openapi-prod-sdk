// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    public class ConfirmSaasShareRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // JSON请求参数，示例字数限制，完整可见：
        // {"org_order_id": "","out_payer_id": {"reference_id_type": "","reference_id": ""},"outRequestId": "","confirmAmount": {"cent": "","currency": "","currencyValue": ""},"share_info": {"payee_account": {"inst_id": "","account_no": "","account_name": "","offical_name": "","offical_number": ""},"out_payee_id": {"reference_id_type": "","reference_id": ""},"share_amount": "","share_currency":"","info_id":"","state":""},"platform_member_id": ""}
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

        // 版本号
        [NameInMap("service_version")]
        [Validation(Required=true)]
        public string ServiceVersion { get; set; }

    }

}
