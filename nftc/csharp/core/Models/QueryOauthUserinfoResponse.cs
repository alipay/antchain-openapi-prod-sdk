// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class QueryOauthUserinfoResponse : TeaModel {
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

        // 昵称
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 头像链接
        [NameInMap("avatar")]
        [Validation(Required=false)]
        public string Avatar { get; set; }

        // 用户id
        [NameInMap("open_user_id")]
        [Validation(Required=false)]
        public string OpenUserId { get; set; }

        // 租户下用户id
        [NameInMap("tenant_uid")]
        [Validation(Required=false)]
        public string TenantUid { get; set; }

        // 用户手机号
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 0-未实名; 1-已实名
        [NameInMap("is_real_name_verified")]
        [Validation(Required=false)]
        public long? IsRealNameVerified { get; set; }

    }

}
