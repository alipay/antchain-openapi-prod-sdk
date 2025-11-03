// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class SubmitAuditMeiyouRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 美柚审核信息存储请求
        [NameInMap("save_info")]
        [Validation(Required=false)]
        public List<MeiyouAuditSaveWebRequest> SaveInfo { get; set; }

    }

}
