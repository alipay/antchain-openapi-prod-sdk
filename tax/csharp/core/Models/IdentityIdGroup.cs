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

        // 打标数据返回的url
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

    }

}
