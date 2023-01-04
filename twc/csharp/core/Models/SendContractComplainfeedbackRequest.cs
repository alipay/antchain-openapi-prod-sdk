// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SendContractComplainfeedbackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝侧投诉单号
        [NameInMap("complain_event_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ComplainEventId { get; set; }

        // 反馈类目ID
        // 00:使用体验保障金退款；
        // 02:通过其他方式退款;
        // 03:已发货;
        // 04:其他;
        // 05:已完成售后服务;
        // 06:非我方责任范围；
        [NameInMap("feedback_code")]
        [Validation(Required=true, MaxLength=32)]
        public string FeedbackCode { get; set; }

        // 反馈内容，字数不超过200个字
        [NameInMap("feedback_content")]
        [Validation(Required=true, MaxLength=200)]
        public string FeedbackContent { get; set; }

        // 商家处理投诉时反馈凭证的图片id，多个逗号隔开（图片id可以通过"商户上传处理图片"接口获取）
        [NameInMap("feedback_images")]
        [Validation(Required=false)]
        public string FeedbackImages { get; set; }

        // 处理投诉人，字数不超过6个字
        [NameInMap("operator")]
        [Validation(Required=false, MaxLength=32)]
        public string Operator { get; set; }

    }

}
