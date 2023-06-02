// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetLoginconfigResponse : TeaModel {
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

        // 密码最小长度
        [NameInMap("password_min_length")]
        [Validation(Required=false)]
        public long? PasswordMinLength { get; set; }

        // 密码最大长度
        [NameInMap("password_max_length")]
        [Validation(Required=false)]
        public long? PasswordMaxLength { get; set; }

        // 密码是否必须包含小写字母
        [NameInMap("password_lowercase_letter")]
        [Validation(Required=false)]
        public bool? PasswordLowercaseLetter { get; set; }

        // 密码是否必须包含大写字母
        [NameInMap("password_uppercase_letter")]
        [Validation(Required=false)]
        public bool? PasswordUppercaseLetter { get; set; }

        // 密码是否必须包含字母
        [NameInMap("password_letter")]
        [Validation(Required=false)]
        public bool? PasswordLetter { get; set; }

        // 密码是否必须包含数字
        [NameInMap("password_digit")]
        [Validation(Required=false)]
        public bool? PasswordDigit { get; set; }

        // 密码是否必须包含特殊字符
        [NameInMap("password_special_char")]
        [Validation(Required=false)]
        public bool? PasswordSpecialChar { get; set; }

        // 是否检查密码有效
        [NameInMap("password_valid_check")]
        [Validation(Required=false)]
        public bool? PasswordValidCheck { get; set; }

        // 密码有效期
        [NameInMap("password_valid_period")]
        [Validation(Required=false)]
        public long? PasswordValidPeriod { get; set; }

        // 密码过期后是否允许登录
        [NameInMap("password_expired_login")]
        [Validation(Required=false)]
        public bool? PasswordExpiredLogin { get; set; }

        // 是否检查密码历史
        [NameInMap("password_history_check")]
        [Validation(Required=false)]
        public bool? PasswordHistoryCheck { get; set; }

        // 密码历史个数
        [NameInMap("password_history_num")]
        [Validation(Required=false)]
        public long? PasswordHistoryNum { get; set; }

        // 重试校验是否触发锁定
        [NameInMap("verify_attempts_check")]
        [Validation(Required=false)]
        public bool? VerifyAttemptsCheck { get; set; }

        // 重试校验窗口
        [NameInMap("verify_attempts_window")]
        [Validation(Required=false)]
        public long? VerifyAttemptsWindow { get; set; }

        // 重试校验触发锁定阈值
        [NameInMap("verify_attempts_threshold")]
        [Validation(Required=false)]
        public long? VerifyAttemptsThreshold { get; set; }

        // 锁定时间
        [NameInMap("lockout_duration")]
        [Validation(Required=false)]
        public long? LockoutDuration { get; set; }

        // 是否检查账户活跃
        [NameInMap("active_check")]
        [Validation(Required=false)]
        public bool? ActiveCheck { get; set; }

        // 活跃周期，非活跃时锁定登录
        [NameInMap("active_period")]
        [Validation(Required=false)]
        public long? ActivePeriod { get; set; }

        // 是否允许自主管理密码
        [NameInMap("password_self_manage")]
        [Validation(Required=false)]
        public bool? PasswordSelfManage { get; set; }

        // 是否允许自主管理MFA
        [NameInMap("mfa_self_manage")]
        [Validation(Required=false)]
        public bool? MfaSelfManage { get; set; }

        // 状态, 取值范围：NORMAL(正常状态), LOCK(锁定), ONE_PARTY_MIGRATING(一方化迁移中), ONE_PARTY_MIGRATION_LOCK(一方化迁移完成，禁用蚂蚁登录)
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 并发登录的ip数量，小于1表示不限制
        [NameInMap("concurrent_ip_count")]
        [Validation(Required=false)]
        public long? ConcurrentIpCount { get; set; }

    }

}
