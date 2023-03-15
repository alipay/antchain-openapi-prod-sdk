// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 行驶证核验结果
    public class VehicleLicenseCertResult : TeaModel {
        // 与车辆的车牌号是否一致
        [NameInMap("plate_number")]
        [Validation(Required=false)]
        public bool? PlateNumber { get; set; }

        // 与车辆对应号牌种类是否一致
        [NameInMap("plate_type")]
        [Validation(Required=false)]
        public bool? PlateType { get; set; }

        // 与车辆所有人是否一致
        [NameInMap("owner")]
        [Validation(Required=false)]
        public bool? Owner { get; set; }

    }

}
