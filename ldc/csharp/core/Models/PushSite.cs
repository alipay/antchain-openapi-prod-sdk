// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 站点信息
    public class PushSite : TeaModel {
        // 是否当前站点
        [NameInMap("current")]
        [Validation(Required=true)]
        public bool? Current { get; set; }

        // 站点描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 站点唯一标识
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 接口类型，可选（RPC，REST）
        [NameInMap("interface_type")]
        [Validation(Required=true)]
        public string InterfaceType { get; set; }

        // 站点 DRM endpoints
        [NameInMap("interface_urls")]
        [Validation(Required=false)]
        public List<string> InterfaceUrls { get; set; }

        // 站点名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 站点部署单元
        [NameInMap("site_cells")]
        [Validation(Required=false)]
        public List<SiteCell> SiteCells { get; set; }

        // 站点类型，可选（MAIN，ISOMERISM）
        [NameInMap("site_type")]
        [Validation(Required=true)]
        public string SiteType { get; set; }

    }

}
