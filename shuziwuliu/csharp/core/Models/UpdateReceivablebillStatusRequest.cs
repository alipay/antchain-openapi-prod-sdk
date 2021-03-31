// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UpdateReceivablebillStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账单id，客户生成的账单唯一编号
        [NameInMap("bill_id")]
        [Validation(Required=true)]
        public string BillId { get; set; }

        // 收款方did，账单的收款方数字身份
        [NameInMap("bill_payee_did")]
        [Validation(Required=true)]
        public string BillPayeeDid { get; set; }

        // 账单后续所可能产生的状态，以下三选一填写：账单确认、部分结算、已结清
        // 
        // 
        [NameInMap("update_status")]
        [Validation(Required=true)]
        public string UpdateStatus { get; set; }

        // 更新状态时间，13位毫秒级时间戳
        [NameInMap("update_status_time")]
        [Validation(Required=true)]
        public long? UpdateStatusTime { get; set; }

    }

}
