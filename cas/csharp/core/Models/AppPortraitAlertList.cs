// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用画像告警明细列表
    public class AppPortraitAlertList : TeaModel {
        // 标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 告警事件ID
        [NameInMap("event_id")]
        [Validation(Required=true)]
        public string EventId { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 告警级别
        [NameInMap("severity")]
        [Validation(Required=true)]
        public string Severity { get; set; }

        // 告警内容
        [NameInMap("alert_content")]
        [Validation(Required=true)]
        public string AlertContent { get; set; }

        // 告警时间
        [NameInMap("gmt_occur_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtOccurTimestamp { get; set; }

        // 相关链接
        [NameInMap("alarm_url")]
        [Validation(Required=true)]
        public string AlarmUrl { get; set; }

        //      * HEALTHY(0), // 健康
        //      * PENDING(1), // 触发中
        //      * FIRING(2), // 告警中
        //      * SUSPENDED(3), // 已暂停
        //      * SILENCED(4), // 已静默
        //      * RECOVERED(5), // 已恢复
        // 
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
