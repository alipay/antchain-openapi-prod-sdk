// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 用户结构体
    public class User : TeaModel {
        // 用户账户，手机号格式为： +区号-手机号，分享码：6位字母，支付宝登录账号：手机号/邮箱
        [NameInMap("user_id_no")]
        [Validation(Required=true)]
        public string UserIdNo { get; set; }

        // 用户账号类型，当前仅支持手机号和分享码，PHONE：手机号，SHARE_CODE：分享码，
        // ALIPAY_LOGON_ID：支付宝登录账号
        [NameInMap("user_id_type")]
        [Validation(Required=true)]
        public string UserIdType { get; set; }

    }

}
