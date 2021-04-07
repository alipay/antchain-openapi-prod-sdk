// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 用户信息
    public class UserInfo : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 用户来源系统，例如BUC,LDAP
        [NameInMap("source_system")]
        [Validation(Required=false)]
        public string SourceSystem { get; set; }

        // 用户在源系统的id
        [NameInMap("source_user_id")]
        [Validation(Required=false)]
        public string SourceUserId { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 真实名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 昵称
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 客户ID
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 是否超级管理员
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 用户状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 即时通信账号
        [NameInMap("im_account")]
        [Validation(Required=false)]
        public string ImAccount { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 联系座机
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 工号
        [NameInMap("work_no")]
        [Validation(Required=false)]
        public string WorkNo { get; set; }

        // 英文名
        [NameInMap("en_name")]
        [Validation(Required=false)]
        public string EnName { get; set; }

        // 性别
        [NameInMap("sex")]
        [Validation(Required=false)]
        public string Sex { get; set; }

        // 国籍
        [NameInMap("nation_country")]
        [Validation(Required=false)]
        public string NationCountry { get; set; }

        // 民族
        [NameInMap("nation")]
        [Validation(Required=false)]
        public string Nation { get; set; }

        // 个人照片路径
        [NameInMap("personal_photo")]
        [Validation(Required=false)]
        public string PersonalPhoto { get; set; }

        // 上次登录时间.
        [NameInMap("last_logon_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastLogonTime { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
