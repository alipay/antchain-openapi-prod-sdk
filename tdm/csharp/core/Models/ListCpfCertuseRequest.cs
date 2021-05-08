// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class ListCpfCertuseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 端ID
        [NameInMap("terminal_identity")]
        [Validation(Required=true)]
        public string TerminalIdentity { get; set; }

        // 证明ID
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

        // 筛选时间 按月份筛选
        [NameInMap("option_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OptionTime { get; set; }

    }

}
