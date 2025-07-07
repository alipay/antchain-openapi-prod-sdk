// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 车五项信息
    public class CarItemsInfo : TeaModel {
        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 车架号
        [NameInMap("vin")]
        [Validation(Required=false)]
        public string Vin { get; set; }

        // 发动机号
        [NameInMap("engine_no")]
        [Validation(Required=false)]
        public string EngineNo { get; set; }

        // 注册日期
        [NameInMap("register_date")]
        [Validation(Required=false)]
        public string RegisterDate { get; set; }

        // 车辆型号
        [NameInMap("model_code")]
        [Validation(Required=false)]
        public string ModelCode { get; set; }

    }

}
