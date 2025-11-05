// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 车辆资产验证增强版车辆信息
    public class CarInfoPlus : TeaModel {
        // 车牌号
        [NameInMap("plate_no")]
        [Validation(Required=false)]
        public string PlateNo { get; set; }

        // 车辆型号，格式：1，2，3...
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 车辆颜色，格式：1，2，3
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

    }

}
