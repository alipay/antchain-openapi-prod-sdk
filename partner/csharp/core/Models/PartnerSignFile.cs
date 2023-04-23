// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 合作方签约文件
    public class PartnerSignFile : TeaModel {
        // 文件类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 文件名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 可预览地址
        [NameInMap("oss_url")]
        [Validation(Required=true)]
        public string OssUrl { get; set; }

    }

}
