// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerPendingeventResponse : TeaModel {
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

        // 事件id
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // 通知:NOTIFICATION 
        // 确认函:CONFIRMATION
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // ("PENDING","待办中"), ("CONFIRMED","确认"), ("REJECTED","已拒绝") ("FAILED","失败"),("EXPIRED","已过期");
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 待办内容主题
        [NameInMap("content_subject")]
        [Validation(Required=false)]
        public string ContentSubject { get; set; }

        // 待办内容详情
        // content_type=link，是文件访问链接
        // content_type=text，是富文本
        [NameInMap("content_details")]
        [Validation(Required=false)]
        public string ContentDetails { get; set; }

        // 待办类型 
        // text 
        // link
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

        // 待办处理页面操作按钮 
        // ACKNOWLEDGE 我已知晓
        //  CONFIRM 确认
        //  RETURN 返回 
        // REJECT 拒绝
        [NameInMap("action_options_config")]
        [Validation(Required=false)]
        public string ActionOptionsConfig { get; set; }

        // 事件有效期开始
        [NameInMap("effective_start_time")]
        [Validation(Required=false)]
        public string EffectiveStartTime { get; set; }

        // 事件有效期结束
        [NameInMap("effective_end_time")]
        [Validation(Required=false)]
        public string EffectiveEndTime { get; set; }

        // 待办事件模版code
        // "INDIRECT_MERCHANT_CONFIRM","间联模式二级商户进件确认",
        // "FINANCING_GRANT_CREDIT","融资授信场景"
        // "FINANCING_USE_CREDIT","融资用信场景"     
        [NameInMap("pending_template_code")]
        [Validation(Required=false)]
        public string PendingTemplateCode { get; set; }

        // 操作时间
        [NameInMap("operate_time")]
        [Validation(Required=false)]
        public string OperateTime { get; set; }

    }

}
