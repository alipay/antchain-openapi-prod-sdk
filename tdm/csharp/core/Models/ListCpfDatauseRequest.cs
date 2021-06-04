// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class ListCpfDatauseRequest : TeaModel {
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

        // 使用方ID
        [NameInMap("data_user_identity")]
        [Validation(Required=true)]
        public string DataUserIdentity { get; set; }

        // 用户身份证ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=false)]
        public string DataOwnerIdentity { get; set; }

        // 筛选时间，按月份筛选，默认当前月份
        [NameInMap("option_time")]
        [Validation(Required=false)]
        public string OptionTime { get; set; }

        // 数据类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 数据类型
        [NameInMap("data_code")]
        [Validation(Required=false)]
        public string DataCode { get; set; }

    }

}
