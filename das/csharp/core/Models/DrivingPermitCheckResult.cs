// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 行驶证核验信息
    public class DrivingPermitCheckResult : TeaModel {
        // 车牌号
        [NameInMap("platenumber")]
        [Validation(Required=false)]
        public string Platenumber { get; set; }

        // 车牌种类
        [NameInMap("platetype")]
        [Validation(Required=false)]
        public string Platetype { get; set; }

        // 所有人
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

    }

}
