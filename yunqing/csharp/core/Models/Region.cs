// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 地域
    public class Region : TeaModel {
        // 地域标识（与阿里云identity对齐）
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 地域的名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // region的id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // 显示的名字，可重复
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 所在城市
        [NameInMap("city")]
        [Validation(Required=true)]
        public string City { get; set; }

        // 是否金区：FINANCIAL， NON_FINANCIAL
        [NameInMap("tag")]
        [Validation(Required=true)]
        public string Tag { get; set; }

    }

}
