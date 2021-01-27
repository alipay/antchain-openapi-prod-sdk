// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetAliyunUserResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 阿里云用户ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 主账号类型下有值，即type为ENTERPRISE和PERSONAL时有值
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // RAM子账号的显示名称
        [NameInMap("ram_display_name")]
        [Validation(Required=false)]
        public string RamDisplayName { get; set; }

        // 用户所属租户
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 阿里云用户类型，分为主账号企业（ENTERPRISE），主账号个人（PERSONAL），和子账号（RAM）
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 显示名
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

    }

}
