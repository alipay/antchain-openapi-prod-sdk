// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 场所信息
    public class SceneInfo : TeaModel {
        // 场所名称
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

        // 场所码
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

    }

}
