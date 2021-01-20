// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateAppbaselineSidecarRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用sidecar基线id
        [NameInMap("appbaseline_id")]
        [Validation(Required=false)]
        public string AppbaselineId { get; set; }

        // 是否开启sidecar
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

        // sidecar版本号
        [NameInMap("sidecar_version")]
        [Validation(Required=false)]
        public string SidecarVersion { get; set; }

    }

}
