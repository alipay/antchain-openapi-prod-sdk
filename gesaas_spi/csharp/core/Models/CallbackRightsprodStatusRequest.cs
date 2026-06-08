// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS_SPI.Models
{
    public class CallbackRightsprodStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 权益编码
        [NameInMap("rights_code")]
        [Validation(Required=true)]
        public string RightsCode { get; set; }

        // 券码
        [NameInMap("voucher_code")]
        [Validation(Required=true)]
        public string VoucherCode { get; set; }

        // 券变更状态
        // V_USE（使用）
        // V_REFUND（退款）
        // V_EXPIRE（过期）
        // V_INVALID（作废）
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
