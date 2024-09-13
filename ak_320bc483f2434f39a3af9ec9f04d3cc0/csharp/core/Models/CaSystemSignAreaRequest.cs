// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署区域信息（包括印模信息）
    public class CaSystemSignAreaRequest : TeaModel {
        // 印章id,联系签署中心获取
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // 印章的url，如果印章url和印章id都不传，则自动生成默认印章加盖（自动签署）
        [NameInMap("seal_url")]
        [Validation(Required=false)]
        public string SealUrl { get; set; }

        // 用印对齐类型,TOP_LEFT("TOP_LEFT", "左上角对齐"), BOTTOM_LEFT("BOTTOM_LEFT", "左下角对齐"), CENTER("CENTER", "xy值是印章的中心"), TOP_RIGHT("TOP_RIGHT", "xy值是印章右上角"), BOTTOM_RIGHT("BOTTOM_RIGHT", "xy值是印章右下角")
        [NameInMap("location_type")]
        [Validation(Required=true)]
        public string LocationType { get; set; }

        // 签署位置类型，1-正文，2-骑缝
        [NameInMap("position_type")]
        [Validation(Required=true)]
        public string PositionType { get; set; }

        // 骑缝章信息，需要盖骑缝章的时候 请传递此参数
        [NameInMap("system_cross_page_request")]
        [Validation(Required=false)]
        public CaSystemCrossPageRequest SystemCrossPageRequest { get; set; }

        // 正文章信息，正文章模式必填
        [NameInMap("system_main_body_request")]
        [Validation(Required=false)]
        public CaSystemMainBodyRequest SystemMainBodyRequest { get; set; }

    }

}
