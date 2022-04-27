// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 充电明细信息
    public class ChargeDetail : TeaModel {
        // 开始时间
        [NameInMap("detail_start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DetailStartTime { get; set; }

        // 结束时间
        [NameInMap("detail_end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DetailEndTime { get; set; }

        // 时段电价，小数点后4位
        [NameInMap("elec_price")]
        [Validation(Required=false)]
        public string ElecPrice { get; set; }

        // 时段服务费价格，小数点后4位
        [NameInMap("service_price")]
        [Validation(Required=false)]
        public string ServicePrice { get; set; }

        // 时段充电量，单位：度，小数点后2位
        [NameInMap("detail_power")]
        [Validation(Required=true)]
        public string DetailPower { get; set; }

        // 时段电费，小数点后2位
        [NameInMap("detail_elec_money")]
        [Validation(Required=false)]
        public string DetailElecMoney { get; set; }

        // 时段服务费，小数点后2位
        [NameInMap("detail_service_money")]
        [Validation(Required=false)]
        public string DetailServiceMoney { get; set; }

    }

}
