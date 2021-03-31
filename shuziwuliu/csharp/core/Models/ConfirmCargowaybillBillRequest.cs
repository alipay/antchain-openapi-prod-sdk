// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ConfirmCargowaybillBillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账单金额（两位小数）
        [NameInMap("bill_amount")]
        [Validation(Required=true)]
        public string BillAmount { get; set; }

        // 账单code（账单唯一标识）
        [NameInMap("bill_code")]
        [Validation(Required=true)]
        public string BillCode { get; set; }

        // 账单确认货主did
        [NameInMap("bill_consignor_did")]
        [Validation(Required=true)]
        public string BillConsignorDid { get; set; }

        // 账单确认日期（毫秒）
        [NameInMap("bill_sure_date")]
        [Validation(Required=false)]
        public long? BillSureDate { get; set; }

        // 是否结算
        [NameInMap("whether_settle")]
        [Validation(Required=true)]
        public bool? WhetherSettle { get; set; }

        // 平台did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

    }

}
