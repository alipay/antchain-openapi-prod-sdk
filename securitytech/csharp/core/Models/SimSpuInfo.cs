// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 两轮车一体机车辆SPU
    public class SimSpuInfo : TeaModel {
        // SPU ID
        [NameInMap("spu_id")]
        [Validation(Required=true)]
        public string SpuId { get; set; }

        // spu名称
        [NameInMap("spu_name")]
        [Validation(Required=true)]
        public string SpuName { get; set; }

        // spu图片信息
        [NameInMap("spu_picture_info")]
        [Validation(Required=true)]
        public SpuPictureInfo SpuPictureInfo { get; set; }

    }

}
