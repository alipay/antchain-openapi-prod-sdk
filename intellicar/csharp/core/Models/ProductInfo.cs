// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 车型信息
    public class ProductInfo : TeaModel {
        // 能源类型
        [NameInMap("fueltype")]
        [Validation(Required=true)]
        public string Fueltype { get; set; }

        // 车型名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 车型id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}
