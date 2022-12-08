// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class SendProductNoticeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 提醒类型
        [NameInMap("notice_type")]
        [Validation(Required=true)]
        public string NoticeType { get; set; }

        // 租户ID
        [NameInMap("tenant_uid")]
        [Validation(Required=true)]
        public string TenantUid { get; set; }

        // 钉钉结构体
        [NameInMap("ding_talk_content")]
        [Validation(Required=false)]
        public DingTalkContent DingTalkContent { get; set; }

        // 短信内容
        [NameInMap("sms_content")]
        [Validation(Required=false)]
        public SmsContent SmsContent { get; set; }

        // email结构体
        [NameInMap("email_content")]
        [Validation(Required=false)]
        public EmailContent EmailContent { get; set; }

    }

}
