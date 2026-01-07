// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备物模型行程统计信息
    public class DeviceTripProperties : TeaModel {
        // 上报时间
        [NameInMap("report_time")]
        [Validation(Required=true)]
        public string ReportTime { get; set; }

        // 1
        [NameInMap("power_status")]
        [Validation(Required=true)]
        public string PowerStatus { get; set; }

        // 1
        [NameInMap("endurance_mileage")]
        [Validation(Required=true)]
        public string EnduranceMileage { get; set; }

        // 1
        [NameInMap("total_mileage")]
        [Validation(Required=true)]
        public string TotalMileage { get; set; }

        // 1
        [NameInMap("speed")]
        [Validation(Required=true)]
        public string Speed { get; set; }

        // 1
        [NameInMap("coord")]
        [Validation(Required=true)]
        public string Coord { get; set; }

        // 1
        [NameInMap("location")]
        [Validation(Required=true)]
        public string Location { get; set; }

        // 1
        [NameInMap("rein")]
        [Validation(Required=true)]
        public string Rein { get; set; }

        // 1
        [NameInMap("spd_bd")]
        [Validation(Required=true)]
        public string SpdBd { get; set; }

        // 1
        [NameInMap("cs")]
        [Validation(Required=true)]
        public string Cs { get; set; }

        // 1
        [NameInMap("eqst")]
        [Validation(Required=true)]
        public string Eqst { get; set; }

    }

}
