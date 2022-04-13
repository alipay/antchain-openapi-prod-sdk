// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 异构机房部署单元
    public class SiteCell : TeaModel {
        // 异构机房名
        [NameInMap("site_name")]
        [Validation(Required=true)]
        public string SiteName { get; set; }

        // 部署单元名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 地域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

    }

}
