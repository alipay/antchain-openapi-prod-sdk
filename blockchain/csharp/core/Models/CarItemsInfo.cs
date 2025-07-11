// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 车五项信息
    public class CarItemsInfo : TeaModel {
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

        // 品牌车型
        [NameInMap("model_code")]
        [Validation(Required=false)]
        public string ModelCode { get; set; }

        // 营运性质
        [NameInMap("use_nature_code")]
        [Validation(Required=false)]
        public string UseNatureCode { get; set; }

    }

}
