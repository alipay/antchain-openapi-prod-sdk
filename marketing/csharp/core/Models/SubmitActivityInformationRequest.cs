// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    public class SubmitActivityInformationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 活动标识
        [NameInMap("activity_id")]
        [Validation(Required=true)]
        public string ActivityId { get; set; }

        // 渠道编码
        [NameInMap("activity_channel")]
        [Validation(Required=true)]
        public string ActivityChannel { get; set; }

        // 活动表单
        [NameInMap("activity_form_data")]
        [Validation(Required=true)]
        public string ActivityFormData { get; set; }

        // 提交时间，ISO_DATE_TIME 时间格式
        [NameInMap("submit_date")]
        [Validation(Required=false)]
        public string SubmitDate { get; set; }

        // 情报标识，存在则更新
        [NameInMap("information_id")]
        [Validation(Required=false)]
        public string InformationId { get; set; }

        // 可选附件
        [NameInMap("attachments")]
        [Validation(Required=false)]
        public List<Attachment> Attachments { get; set; }

    }

}
