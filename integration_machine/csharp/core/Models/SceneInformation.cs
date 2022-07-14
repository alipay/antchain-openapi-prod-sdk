// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 场所信息
    public class SceneInformation : TeaModel {
        // 场所地址
        [NameInMap("scene_address")]
        [Validation(Required=true)]
        public string SceneAddress { get; set; }

        // 场所ID
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public string SceneId { get; set; }

    }

}
