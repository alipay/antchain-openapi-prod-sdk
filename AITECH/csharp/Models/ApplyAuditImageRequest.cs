// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class ApplyAuditImageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审核内容链接
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 审核类型列表
        [NameInMap("sec_types")]
        [Validation(Required=true)]
        public List<string> SecTypes { get; set; }

        // 场景信息
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 数据Id,客户传入，唯一标识
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

    }

}
