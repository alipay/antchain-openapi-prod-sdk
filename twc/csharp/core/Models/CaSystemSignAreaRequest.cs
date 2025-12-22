// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 签署区域信息（包括印模信息）
    public class CaSystemSignAreaRequest : TeaModel {
        // 印章印模oss-fileKey 或者oss可预览下载地址
        [NameInMap("seal_pic_addr")]
        [Validation(Required=false)]
        public string SealPicAddr { get; set; }

        // 用印对齐类型
        [NameInMap("location_type")]
        [Validation(Required=true)]
        public string LocationType { get; set; }

        // 章的旋转角度
        [NameInMap("rotate_angle")]
        [Validation(Required=false)]
        public long? RotateAngle { get; set; }

        // 签署位置类型	1代表正文章，2代表骑缝章
        [NameInMap("position_type")]
        [Validation(Required=true)]
        public long? PositionType { get; set; }

        // 指定外部印章类型
        [NameInMap("external_seal_type")]
        [Validation(Required=false)]
        public string ExternalSealType { get; set; }

        // 骑缝章信息
        [NameInMap("ca_system_cross_page_request")]
        [Validation(Required=false)]
        public CaSystemCrossPageRequest CaSystemCrossPageRequest { get; set; }

        // 正文章信息
        [NameInMap("ca_system_main_body_request")]
        [Validation(Required=false)]
        public CaSystemMainBodyRequest CaSystemMainBodyRequest { get; set; }

    }

}
