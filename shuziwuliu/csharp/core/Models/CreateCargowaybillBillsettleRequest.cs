// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateCargowaybillBillsettleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 平台did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 账单code（账单唯一标识）
        [NameInMap("bill_code")]
        [Validation(Required=true)]
        public string BillCode { get; set; }

        // 结算金额（2位小数）
        [NameInMap("settle_amount")]
        [Validation(Required=true)]
        public string SettleAmount { get; set; }

        // 结算状态（只有2种状态：部分结算、已结清）
        [NameInMap("settle_status")]
        [Validation(Required=true)]
        public string SettleStatus { get; set; }

    }

}
