// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 蚂蚁扫描镜像
    public class AntScanImage : TeaModel {
        // 镜像名称
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // app名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

    }

}
