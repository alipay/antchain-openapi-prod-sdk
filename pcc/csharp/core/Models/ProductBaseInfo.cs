// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // Product基础信息，包含 code(产品码) ,name(产品名称),name_en(产品英文名)
    public class ProductBaseInfo : TeaModel {
        // 产品码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 产品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品英文名称
        [NameInMap("name_en")]
        [Validation(Required=false)]
        public string NameEn { get; set; }

    }

}
