// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 部分车辆信息
    public class PartialCarInfo : TeaModel {
        // 车牌号码
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

        // 车架号
        [NameInMap("vin")]
        [Validation(Required=true)]
        public string Vin { get; set; }

        // 发动机号
        [NameInMap("engine_no")]
        [Validation(Required=true)]
        public string EngineNo { get; set; }

        // 初登日期
        [NameInMap("register_date")]
        [Validation(Required=true)]
        public string RegisterDate { get; set; }

        // 车辆型号
        [NameInMap("model_code")]
        [Validation(Required=true)]
        public string ModelCode { get; set; }

        // 营运性质
        [NameInMap("use_nature_code")]
        [Validation(Required=true)]
        public string UseNatureCode { get; set; }

    }

}
