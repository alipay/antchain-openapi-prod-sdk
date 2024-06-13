// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic项目品类行业场景内容
    public class IotbasicCategoryIndustrySceneInfo : TeaModel {
        // 行业
        [NameInMap("industry")]
        [Validation(Required=true)]
        public string Industry { get; set; }

        // 场景
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

    }

}
