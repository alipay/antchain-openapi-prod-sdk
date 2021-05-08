// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class GetCpfCertuseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务流水号
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 端ID
        [NameInMap("terminal_identity")]
        [Validation(Required=true)]
        public string TerminalIdentity { get; set; }

        // 用数机构ID
        [NameInMap("data_user_identity")]
        [Validation(Required=true)]
        public string DataUserIdentity { get; set; }

        // 用数机构
        [NameInMap("data_user_name")]
        [Validation(Required=true)]
        public string DataUserName { get; set; }

        // 证明文件ID
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

        // 使用目的
        [NameInMap("purpose")]
        [Validation(Required=false)]
        public string Purpose { get; set; }

        // 使用时间
        [NameInMap("use_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UseTime { get; set; }

    }

}
