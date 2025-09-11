// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 登入登出接口操作日志回参
    public class LoginOperationLogVO : TeaModel {
        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户地址
        [NameInMap("user_address")]
        [Validation(Required=false)]
        public string UserAddress { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 登录类型
        [NameInMap("login_account_type")]
        [Validation(Required=false)]
        public string LoginAccountType { get; set; }

        // 请求URL
        [NameInMap("request_u_r_l")]
        [Validation(Required=true)]
        public string RequestURL { get; set; }

        // 是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=true)]
        public long? GmtCreated { get; set; }

    }

}
