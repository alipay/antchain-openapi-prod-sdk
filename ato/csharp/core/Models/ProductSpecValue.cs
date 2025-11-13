// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 随时享-商品规格值对象
    public class ProductSpecValue : TeaModel {
        // 规格值
        [NameInMap("spec_value")]
        [Validation(Required=false)]
        public string SpecValue { get; set; }

        // 规格图片key
        [NameInMap("image_file_key")]
        [Validation(Required=false)]
        public string ImageFileKey { get; set; }

        // 规格图片http链接
        [NameInMap("large_image_file_key")]
        [Validation(Required=false)]
        public string LargeImageFileKey { get; set; }

    }

}
