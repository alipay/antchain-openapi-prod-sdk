// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    public class QueryYouhuiTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 优惠券模板ID
        [NameInMap("youhui_template_id")]
        [Validation(Required=true)]
        public string YouhuiTemplateId { get; set; }

    }

}
