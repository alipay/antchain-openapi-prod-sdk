// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 法务电子签骑缝章信息
    public class CaSystemCrossPageRequest : TeaModel {
        // 签署开始页码
        [NameInMap("pos_page_start")]
        [Validation(Required=false)]
        public long? PosPageStart { get; set; }

        // 签署结束页码
        [NameInMap("pos_page_end")]
        [Validation(Required=false)]
        public long? PosPageEnd { get; set; }

        // 签署区位置横坐标
        [NameInMap("pos_x")]
        [Validation(Required=true)]
        public long? PosX { get; set; }

        // 签署区位置纵坐标
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public long? PosY { get; set; }

        // 用印次数
        [NameInMap("seal_times")]
        [Validation(Required=false)]
        public long? SealTimes { get; set; }

        // 是否采取系统默认骑缝章用印规则
        [NameInMap("default_cross_page_rule")]
        [Validation(Required=false)]
        public bool? DefaultCrossPageRule { get; set; }

        // 默认骑缝章页数
        [NameInMap("default_cross_page")]
        [Validation(Required=false)]
        public long? DefaultCrossPage { get; set; }

    }

}
