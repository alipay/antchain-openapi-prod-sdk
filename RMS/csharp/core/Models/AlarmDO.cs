// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmDO
    public class AlarmDO : TeaModel {
        // model
        [NameInMap("model")]
        [Validation(Required=false)]
        public Model Model { get; set; }

        // level
        [NameInMap("level")]
        [Validation(Required=false)]
        public string Level { get; set; }

        // frequency
        [NameInMap("frequency")]
        [Validation(Required=false)]
        public long? Frequency { get; set; }

        // silent_minute
        [NameInMap("silent_minute")]
        [Validation(Required=false)]
        public string SilentMinute { get; set; }

        // emergency_copy
        [NameInMap("emergency_copy")]
        [Validation(Required=false)]
        public string EmergencyCopy { get; set; }

        // emergency_url
        [NameInMap("emergency_url")]
        [Validation(Required=false)]
        public string EmergencyUrl { get; set; }

        // time_zone
        [NameInMap("time_zone")]
        [Validation(Required=false)]
        public string TimeZone { get; set; }

        // time_zone_custom
        [NameInMap("time_zone_custom")]
        [Validation(Required=false)]
        public bool? TimeZoneCustom { get; set; }

    }

}
