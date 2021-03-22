// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 图片OSS URL，包含四个不同大小的图片
    public class MultiURL : TeaModel {
        // 上传的图片正常大小
        [NameInMap("normal")]
        [Validation(Required=true)]
        public string Normal { get; set; }

        // style200
        [NameInMap("style_200")]
        [Validation(Required=true)]
        public string Style200 { get; set; }

        // style150
        [NameInMap("style_150")]
        [Validation(Required=true)]
        public string Style150 { get; set; }

        // style70
        [NameInMap("style_70")]
        [Validation(Required=true)]
        public string Style70 { get; set; }

    }

}
