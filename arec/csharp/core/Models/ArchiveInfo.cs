// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 附件材料信息
    public class ArchiveInfo : TeaModel {
        // 附件存储OSS路径
        [NameInMap("oss_key")]
        [Validation(Required=false)]
        public string OssKey { get; set; }

        // 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 附件内容摘要
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

    }

}
