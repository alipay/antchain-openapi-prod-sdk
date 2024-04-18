// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 取证三方系统信息
    public class EvidenceThirdPartyInfo : TeaModel {
        // 三方系统用户提交网址时间
        [NameInMap("submit_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SubmitTime { get; set; }

        // 三方系统地址
        [NameInMap("system_url")]
        [Validation(Required=true)]
        public string SystemUrl { get; set; }

        // 三方系统账号
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 三方系统名称
        [NameInMap("system_name")]
        [Validation(Required=true)]
        public string SystemName { get; set; }

        // 用户取证时登录的时间
        [NameInMap("login_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LoginTime { get; set; }

        // 用户取证时登录的IP
        [NameInMap("login_ip")]
        [Validation(Required=true)]
        public string LoginIp { get; set; }

    }

}
