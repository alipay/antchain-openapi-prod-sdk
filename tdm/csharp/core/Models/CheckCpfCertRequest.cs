// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class CheckCpfCertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部业务流水
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 端ID
        [NameInMap("terminal_identity")]
        [Validation(Required=true)]
        public string TerminalIdentity { get; set; }

        // 证明ID
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

        // 身份证ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 使用方ID
        [NameInMap("data_user_identity")]
        [Validation(Required=false)]
        public string DataUserIdentity { get; set; }

        // 使用方名称
        [NameInMap("data_user_name")]
        [Validation(Required=false)]
        public string DataUserName { get; set; }

        // 用途
        [NameInMap("purpose")]
        [Validation(Required=false)]
        public string Purpose { get; set; }

        // 使用时间
        [NameInMap("use_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UseTime { get; set; }

        // 扩展字段
        [NameInMap("extend_params")]
        [Validation(Required=true)]
        public string ExtendParams { get; set; }

    }

}
