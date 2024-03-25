// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // 查询结果
    public class QueryResult : TeaModel {
        // 工号
        [NameInMap("work_no")]
        [Validation(Required=true)]
        public string WorkNo { get; set; }

        // 花名
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 域账号
        [NameInMap("login_account")]
        [Validation(Required=true)]
        public string LoginAccount { get; set; }

        // 企业邮箱
        [NameInMap("bu_mail")]
        [Validation(Required=true)]
        public string BuMail { get; set; }

        // 人员类型
        [NameInMap("emp_type")]
        [Validation(Required=true)]
        public string EmpType { get; set; }

    }

}
