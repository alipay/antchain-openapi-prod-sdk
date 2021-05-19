// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class GetCpfDataRequest : TeaModel {
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

        // 业务流水号
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 使用方ID
        [NameInMap("data_user_identity")]
        [Validation(Required=true)]
        public string DataUserIdentity { get; set; }

        // 使用方名称
        [NameInMap("data_user_name")]
        [Validation(Required=true)]
        public string DataUserName { get; set; }

        // 用户ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 用户姓名
        [NameInMap("data_owner_name")]
        [Validation(Required=true)]
        public string DataOwnerName { get; set; }

        // 数据源ID
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // 数据项code
        [NameInMap("data_code")]
        [Validation(Required=true)]
        public string DataCode { get; set; }

        // 扩展字段。
        [NameInMap("extend_params")]
        [Validation(Required=false)]
        public string ExtendParams { get; set; }

    }

}
