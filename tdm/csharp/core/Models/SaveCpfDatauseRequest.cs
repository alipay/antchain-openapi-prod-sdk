// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class SaveCpfDatauseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 使用方ID
        [NameInMap("data_user_identity")]
        [Validation(Required=true)]
        public string DataUserIdentity { get; set; }

        // 使用方名称
        [NameInMap("data_user_name")]
        [Validation(Required=true)]
        public string DataUserName { get; set; }

        // 数据拥有方ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 数据拥有方名称
        [NameInMap("data_owner_name")]
        [Validation(Required=true)]
        public string DataOwnerName { get; set; }

        // 数据源ID
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // 数据源名称
        [NameInMap("provider_name")]
        [Validation(Required=true)]
        public string ProviderName { get; set; }

        // 端ID
        [NameInMap("terminal_identity")]
        [Validation(Required=true)]
        public string TerminalIdentity { get; set; }

        // 业务数据描述
        [NameInMap("data_desc")]
        [Validation(Required=true)]
        public string DataDesc { get; set; }

        // 存证数据hash
        [NameInMap("data_hash")]
        [Validation(Required=true)]
        public string DataHash { get; set; }

    }

}
