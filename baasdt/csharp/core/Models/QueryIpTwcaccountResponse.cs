// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpTwcaccountResponse : TeaModel {
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

        // 机构账号
        [NameInMap("organization_id")]
        [Validation(Required=false)]
        public string OrganizationId { get; set; }

        // 用户类型为个人时返回用户账号；用户类型为机构时返回经办人账号
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 是否签署了静默授权
        [NameInMap("silently_sign")]
        [Validation(Required=false)]
        public bool? SilentlySign { get; set; }

        // 账户链上ID
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

    }

}
