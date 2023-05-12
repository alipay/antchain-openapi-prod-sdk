// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // app信息及统计信息
    public class AppStats : TeaModel {
        // app name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 异常数
        [NameInMap("exception_total")]
        [Validation(Required=false)]
        public long? ExceptionTotal { get; set; }

        // 时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 发起方
        [NameInMap("initiator")]
        [Validation(Required=false)]
        public List<string> Initiator { get; set; }

        // 参与者
        [NameInMap("participator")]
        [Validation(Required=false)]
        public List<string> Participator { get; set; }

        // 今日事务总数
        [NameInMap("today_total")]
        [Validation(Required=false)]
        public long? TodayTotal { get; set; }

        // Saga模式返回3，其它模式不返回
        [NameInMap("action_mode")]
        [Validation(Required=false)]
        public long? ActionMode { get; set; }

        // 字段ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

    }

}
