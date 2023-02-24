// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 车辆详细信息
    public class DetailCarInfo : TeaModel {
        // 号牌号码
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

        // 号牌种类，枚举值
        // 
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

        // 初登日期
        [NameInMap("register_date")]
        [Validation(Required=true)]
        public string RegisterDate { get; set; }

        // 车辆型号
        [NameInMap("model_code")]
        [Validation(Required=true)]
        public string ModelCode { get; set; }

        // 是否营运车辆，枚举值
        [NameInMap("use_nature_code")]
        [Validation(Required=true)]
        public string UseNatureCode { get; set; }

        // 能源种类，枚举值
        [NameInMap("fuel_type")]
        [Validation(Required=true)]
        public string FuelType { get; set; }

        // 排量，数字
        [NameInMap("displacement")]
        [Validation(Required=true)]
        public string Displacement { get; set; }

    }

}
