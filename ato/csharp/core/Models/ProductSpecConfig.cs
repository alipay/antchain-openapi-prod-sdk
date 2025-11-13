// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 产品规格定义
    public class ProductSpecConfig : TeaModel {
        // 规格名称
        [NameInMap("spec_key")]
        [Validation(Required=false)]
        public string SpecKey { get; set; }

        // 规格名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 允许值列表
        [NameInMap("spec_value_list")]
        [Validation(Required=false)]
        public List<ProductSpecValue> SpecValueList { get; set; }

    }

}
