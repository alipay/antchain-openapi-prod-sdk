// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 账号信息
    public class UserData : TeaModel {
        // 账号id
        [NameInMap("login_id")]
        [Validation(Required=true)]
        public string LoginId { get; set; }

        // 账号id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 用户姓名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 关联企业
        [NameInMap("ref_firms")]
        [Validation(Required=true)]
        public List<RefFirm> RefFirms { get; set; }

        // 认证状态
        [NameInMap("cert_status")]
        [Validation(Required=true)]
        public string CertStatus { get; set; }

        // 账户类别
        [NameInMap("account_type")]
        [Validation(Required=true)]
        public string AccountType { get; set; }

        // did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

    }

}
