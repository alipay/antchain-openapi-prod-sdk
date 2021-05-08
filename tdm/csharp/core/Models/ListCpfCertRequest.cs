// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class ListCpfCertRequest : TeaModel {
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

        // 身份证ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 证明类型
        [NameInMap("issue_cert_type")]
        [Validation(Required=true)]
        public string IssueCertType { get; set; }

        // 当前页码，默认1
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 每页展示数量，默认10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 时间筛选枚举类型，默认全部
        [NameInMap("option_time")]
        [Validation(Required=false)]
        public string OptionTime { get; set; }

    }

}
