// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用SRE信息，云游资产使用。
    public class Admin : TeaModel {
        // 应用SRE邮箱，云游资产使用。
        [NameInMap("admin_email")]
        [Validation(Required=false)]
        public string AdminEmail { get; set; }

        // 应用SRE登陆名，云游资产使用。
        [NameInMap("admin_login_name")]
        [Validation(Required=false)]
        public string AdminLoginName { get; set; }

        // 应用SRE昵称，云游资产使用
        [NameInMap("admin_nick_name")]
        [Validation(Required=false)]
        public string AdminNickName { get; set; }

        // 应用SRE真实名称，云游资产使用
        [NameInMap("admin_real_name")]
        [Validation(Required=false)]
        public string AdminRealName { get; set; }

        // 应用SRE员工号，云游资产使用
        [NameInMap("admin_staff_no")]
        [Validation(Required=false)]
        public string AdminStaffNo { get; set; }

    }

}
