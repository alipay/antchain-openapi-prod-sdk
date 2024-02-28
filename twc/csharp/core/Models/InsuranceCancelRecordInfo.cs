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

        // 退保保单号
        [NameInMap("cancel_insurance_id")]
        [Validation(Required=true)]
        public string CancelInsuranceId { get; set; }

        // 退还保费 单位分
        [NameInMap("cancel_amount")]
        [Validation(Required=true)]
        public long? CancelAmount { get; set; }

        // 申请退保时间
        // 格式: yyyy-MM-dd HH:mm:ss
        [NameInMap("cancel_apply_time")]
        [Validation(Required=true)]
        public string CancelApplyTime { get; set; }

        // 退保状态
        // CANCEL_INIT: 退保初始化
        // CANCEL_SUCC: 退保成功
        // CANCEL_FAIL: 退保失败
        [NameInMap("cancel_status")]
        [Validation(Required=true)]
        public string CancelStatus { get; set; }

    }

}
