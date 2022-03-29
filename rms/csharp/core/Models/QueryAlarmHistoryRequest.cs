// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryAlarmHistoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 开始时间
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // 结束时间
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // 是否查询所有告警类型
        [NameInMap("all_types")]
        [Validation(Required=true)]
        public bool? AllTypes { get; set; }

        // 告警类型数组
        [NameInMap("alarm_types")]
        [Validation(Required=false)]
        public List<string> AlarmTypes { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // dsid
        [NameInMap("dsid")]
        [Validation(Required=false)]
        public long? Dsid { get; set; }

    }

}
