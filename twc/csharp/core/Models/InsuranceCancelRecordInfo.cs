// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 租赁宝plus退保详情
    public class InsuranceCancelRecordInfo : TeaModel {
        // 保单单号
        [NameInMap("bcl_insurance_record_id")]
        [Validation(Required=true)]
        public string BclInsuranceRecordId { get; set; }

        // 退保id
        [NameInMap("cancel_insurance_id")]
        [Validation(Required=true)]
        public string CancelInsuranceId { get; set; }

        // 退还保费 单位分, 退保成功时返回
        [NameInMap("cancel_amount")]
        [Validation(Required=false)]
        public long? CancelAmount { get; set; }

        // 申请退保时间
        // 格式: yyyy-MM-dd HH:mm:ss
        [NameInMap("cancel_apply_time")]
        [Validation(Required=true)]
        public string CancelApplyTime { get; set; }

        // 退保状态
        // RECORD_CANCEL_INIT: 退保初始
        // RECORD_CANCEL_SUCC: 退保成功
        // RECORD_CANCEL_FAIL: 退保失败
        [NameInMap("cancel_status")]
        [Validation(Required=true)]
        public string CancelStatus { get; set; }

        // 退保失败原, 退保失败时返回
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
