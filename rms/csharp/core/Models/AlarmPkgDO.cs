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
        [Validation(Required=true)]
        public string BizGroupbyName { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // stack_metric_group_metric_table
        [NameInMap("stack_metric_group_metric_table")]
        [Validation(Required=true)]
        public string StackMetricGroupMetricTable { get; set; }

        // tag_value
        [NameInMap("tag_value")]
        [Validation(Required=true)]
        public string TagValue { get; set; }

        // uuid
        [NameInMap("uuid")]
        [Validation(Required=true)]
        public string Uuid { get; set; }

        // alarm
        [NameInMap("alarm")]
        [Validation(Required=true)]
        public AlarmDO Alarm { get; set; }

        // top_alarm
        [NameInMap("top_alarm")]
        [Validation(Required=true)]
        public TopAlarmDO TopAlarm { get; set; }

    }

}
