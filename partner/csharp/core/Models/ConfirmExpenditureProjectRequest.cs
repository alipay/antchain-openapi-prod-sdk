// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    public class ConfirmExpenditureProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public long? ProjectId { get; set; }

        // 客户确认时间
        [NameInMap("confirm_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ConfirmTime { get; set; }

    }

}
