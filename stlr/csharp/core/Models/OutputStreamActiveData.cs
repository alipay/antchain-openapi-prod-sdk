// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 输出流活动数据
    public class OutputStreamActiveData : TeaModel {
        // 物料编码
        [NameInMap("material_code")]
        [Validation(Required=true)]
        public string MaterialCode { get; set; }

        // 用量，非负，最多6位小数
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 单位
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

        // 单价（仅产品用，产品不传时默认为空）
        [NameInMap("unit_price")]
        [Validation(Required=false)]
        public string UnitPrice { get; set; }

        // 处置方式编码（仅废弃物用）
        [NameInMap("disposal_type_code")]
        [Validation(Required=false)]
        public string DisposalTypeCode { get; set; }

        // 运输信息列表（仅废弃物用）
        [NameInMap("transport_list")]
        [Validation(Required=false)]
        public List<TransportActiveData> TransportList { get; set; }

    }

}
