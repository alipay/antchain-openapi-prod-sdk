// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVESERVICE.Models
{
    public class CallbackTaskSmsresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("a_case_id")]
        [Validation(Required=true)]
        public string ACaseId { get; set; }

        // 批次号
        [NameInMap("batch_no")]
        [Validation(Required=true)]
        public string BatchNo { get; set; }

        // 案件主联系人姓名 AES加密
        [NameInMap("collected_name")]
        [Validation(Required=true)]
        public string CollectedName { get; set; }

        // 联系人姓名 AES加密
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 联系人号码 AES加密
        [NameInMap("contact_phone")]
        [Validation(Required=true)]
        public string ContactPhone { get; set; }

        // 联系人状态（有意愿还款之类）
        [NameInMap("contact_status")]
        [Validation(Required=true)]
        public string ContactStatus { get; set; }

        // 短信内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 还款日
        [NameInMap("overdue_date")]
        [Validation(Required=true)]
        public string OverdueDate { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 发送结果 21:客户回复接收成功 10:失败 11:成功
        [NameInMap("send_result")]
        [Validation(Required=true)]
        public string SendResult { get; set; }

        // 发送方式：如果是系统发送，那么为必填(1-短信，2-语音，3-智能语音)
        [NameInMap("send_way")]
        [Validation(Required=true)]
        public long? SendWay { get; set; }

        // 唯一标识(可用来判重)
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 发送时间(毫秒)
        [NameInMap("time")]
        [Validation(Required=true)]
        public long? Time { get; set; }

        // 1 发送 2 接收 -客户回复
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 约定固定值-一般是对应平台的缩写
        [NameInMap("create_by")]
        [Validation(Required=true)]
        public string CreateBy { get; set; }

        // 短信模板
        [NameInMap("template_no")]
        [Validation(Required=true)]
        public string TemplateNo { get; set; }

    }

}
