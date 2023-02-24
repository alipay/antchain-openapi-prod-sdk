// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 车辆基础信息
    public class BasicCarInfo : TeaModel {
        // 号牌号码
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

        // 号牌种类，枚举值
        [NameInMap("license_type")]
        [Validation(Required=true)]
        public string LicenseType { get; set; }

        // 车架号
        [NameInMap("vin")]
        [Validation(Required=true)]
        public string Vin { get; set; }

        // 发动机号
        [NameInMap("engine_no")]
        [Validation(Required=true)]
        public string EngineNo { get; set; }

    }

}
