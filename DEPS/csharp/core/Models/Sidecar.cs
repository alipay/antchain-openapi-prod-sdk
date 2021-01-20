// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // sidecar信息
    // 
    public class Sidecar : TeaModel {
        // sidecar描述内容
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreated { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtModified { get; set; }

        // sidecar名称
        [NameInMap("sidecar_name")]
        [Validation(Required=false)]
        public string SidecarName { get; set; }

        // scope生效范围详情
        [NameInMap("scope_detail")]
        [Validation(Required=false)]
        public SidecarScopeDetail ScopeDetail { get; set; }

    }

}
