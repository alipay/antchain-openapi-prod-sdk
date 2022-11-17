// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4a6e73bdbcb54f7dac260ad8ddbfd24a.Models
{
    // 规则明细
    public class RuleDetail : TeaModel {
        // 项目类别
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 领域
        [NameInMap("fie_id")]
        [Validation(Required=true)]
        public string FieId { get; set; }

        // 级别
        [NameInMap("level")]
        [Validation(Required=true)]
        public string Level { get; set; }

        // 资质
        [NameInMap("qualifications")]
        [Validation(Required=true)]
        public string Qualifications { get; set; }

        // 保定报价
        [NameInMap("price_bd")]
        [Validation(Required=true)]
        public long? PriceBd { get; set; }

        // 离岸价格
        [NameInMap("fob_price")]
        [Validation(Required=true)]
        public long? FobPrice { get; set; }

        // 离岸价格
        [NameInMap("price_tj")]
        [Validation(Required=true)]
        public long? PriceTj { get; set; }

        // 北京报价
        [NameInMap("price_bj")]
        [Validation(Required=true)]
        public long? PriceBj { get; set; }

        // 最少提供人数
        [NameInMap("numpeople")]
        [Validation(Required=true)]
        public long? Numpeople { get; set; }

    }

}
