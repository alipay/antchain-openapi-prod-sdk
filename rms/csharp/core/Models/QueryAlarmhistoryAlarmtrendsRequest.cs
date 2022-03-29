// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryAlarmhistoryAlarmtrendsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // alarm_type
        [NameInMap("alarm_type")]
        [Validation(Required=true)]
        public string AlarmType { get; set; }

        // group_by
        [NameInMap("group_by")]
        [Validation(Required=true)]
        public string GroupBy { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=true)]
        public long? From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=true)]
        public long? To { get; set; }

        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

    }

}
