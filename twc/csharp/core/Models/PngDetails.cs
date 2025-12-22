// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 法务电子签章图片信息
    public class PngDetails : TeaModel {
        // 明细唯一id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 图片 osskey
        [NameInMap("file_key")]
        [Validation(Required=true)]
        public string FileKey { get; set; }

    }

}
