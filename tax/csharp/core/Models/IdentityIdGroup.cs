// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 税号批次清单
    public class IdentityIdGroup : TeaModel {
        // 44-20230810-9-channel
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 请求id，用于幂等控制
        [NameInMap("biz_unique_id")]
        [Validation(Required=true)]
        public string BizUniqueId { get; set; }

        // 数据源
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 上传的文件
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

    }

}
