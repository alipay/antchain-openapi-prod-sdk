// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 短信模板状态查询结果
    public class QueryTemplateStatusRes : TeaModel {
        // 短信模板id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 短信标题
        [NameInMap("sms_title")]
        [Validation(Required=true)]
        public string SmsTitle { get; set; }

        // 模板状态
        [NameInMap("template_status")]
        [Validation(Required=true)]
        public string TemplateStatus { get; set; }

        // 审核结果描述
        [NameInMap("censor_result")]
        [Validation(Required=true)]
        public string CensorResult { get; set; }

    }

}
