// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class ConfirmCpfDatauseResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 使用方ID
        [NameInMap("data_user_identity")]
        [Validation(Required=false)]
        public string DataUserIdentity { get; set; }

        // 使用方名称
        [NameInMap("data_user_name")]
        [Validation(Required=false)]
        public string DataUserName { get; set; }

        // 数据拥有者ID，用户身份证ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=false)]
        public string DataOwnerIdentity { get; set; }

        // 数据拥有者名称，用户名称
        [NameInMap("data_owner_name")]
        [Validation(Required=false)]
        public string DataOwnerName { get; set; }

        // 数据源ID
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // 数据源名称
        [NameInMap("provider_name")]
        [Validation(Required=false)]
        public string ProviderName { get; set; }

        // 存证端ID
        [NameInMap("terminal_identity")]
        [Validation(Required=false)]
        public string TerminalIdentity { get; set; }

        // 业务描述
        [NameInMap("data_desc")]
        [Validation(Required=false)]
        public string DataDesc { get; set; }

        // 存证数据hash
        [NameInMap("data_hash")]
        [Validation(Required=false)]
        public string DataHash { get; set; }

        // 链信息
        [NameInMap("chain_info")]
        [Validation(Required=false)]
        public ChainInfo ChainInfo { get; set; }

    }

}
