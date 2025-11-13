// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商品规格选项
    public class ProductSpecOption : TeaModel {
        // 规格key
        [NameInMap("spec_key")]
        [Validation(Required=false)]
        public string SpecKey { get; set; }

        // 规格名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 规格值
        [NameInMap("spec_value")]
        [Validation(Required=false)]
        public string SpecValue { get; set; }

    }

}
