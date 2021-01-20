// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmPkgDO
    public class AlarmPkgDO : TeaModel {
        // biz_groupby_name
        [NameInMap("biz_groupby_name")]
        [Validation(Required=false)]
        public string BizGroupbyName { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // stack_metric_group_metric_table
        [NameInMap("stack_metric_group_metric_table")]
        [Validation(Required=false)]
        public string StackMetricGroupMetricTable { get; set; }

        // tag_value
        [NameInMap("tag_value")]
        [Validation(Required=false)]
        public string TagValue { get; set; }

        // uuid
        [NameInMap("uuid")]
        [Validation(Required=false)]
        public string Uuid { get; set; }

        // alarm
        [NameInMap("alarm")]
        [Validation(Required=false)]
        public AlarmDO Alarm { get; set; }

        // top_alarm
        [NameInMap("top_alarm")]
        [Validation(Required=false)]
        public TopAlarmDO TopAlarm { get; set; }

    }

}
