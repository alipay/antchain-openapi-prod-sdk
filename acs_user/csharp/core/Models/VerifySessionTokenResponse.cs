// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_USER.Models
{
    public class VerifySessionTokenResponse : TeaModel {
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

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户名称
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 私有化中的租户ID（0表示适用所有租户）
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public long? TenantId { get; set; }

        // 用户类型，OPERATOR：登录账号；SERVICE：服务账号
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 是否已失效
        [NameInMap("expired")]
        [Validation(Required=false)]
        public bool? Expired { get; set; }

        // 是否已冻结
        [NameInMap("disabled")]
        [Validation(Required=false)]
        public bool? Disabled { get; set; }

        // 邮箱地址
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 电话号码
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 失效时间
        [NameInMap("expired_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpiredTime { get; set; }

        // 是否需要修改密码
        [NameInMap("change_required")]
        [Validation(Required=false)]
        public bool? ChangeRequired { get; set; }

    }

}
