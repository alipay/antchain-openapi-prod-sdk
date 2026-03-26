// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 电池衰退报告结果
    public class BatteryReportResult : TeaModel {
        // 订单号 (可使用该 ID 将报告转图片)
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 保障码，VIN 在 7 天内首次检测时生成，每轮保障采用同一保障码
        [NameInMap("guarantee_code")]
        [Validation(Required=true)]
        public string GuaranteeCode { get; set; }

        // 当前充电单号
        [NameInMap("current_start_charge_seq")]
        [Validation(Required=true)]
        public string CurrentStartChargeSeq { get; set; }

        // 是否计费
        [NameInMap("charge")]
        [Validation(Required=true)]
        public bool? Charge { get; set; }

        // 检测类型 6601：首检 6602：复核
        [NameInMap("check_type")]
        [Validation(Required=true)]
        public long? CheckType { get; set; }

        // 报告数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public BatteryReportData Data { get; set; }

    }

}
