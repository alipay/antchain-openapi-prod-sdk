// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ConfirmConsumecardBillcreateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 账单ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 附言(不要超过500个字符)
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 账单创建是否确认成功。true为成功，false为失败
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

    }

}
