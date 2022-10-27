// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品数字指纹鉴定点
    public class GoodsDigitalFingerprintPoint : TeaModel {
        // 鉴定点子项
        [NameInMap("sub_point_name")]
        [Validation(Required=true)]
        public string SubPointName { get; set; }

        // 微观图片url
        [NameInMap("micro_image_url")]
        [Validation(Required=true)]
        public string MicroImageUrl { get; set; }

        // 宏观图片url
        [NameInMap("macro_image_url")]
        [Validation(Required=true)]
        public string MacroImageUrl { get; set; }

    }

}
