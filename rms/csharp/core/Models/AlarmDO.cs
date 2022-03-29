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
        [Validation(Required=true)]
        public Model Model { get; set; }

        // level
        [NameInMap("level")]
        [Validation(Required=true)]
        public string Level { get; set; }

        // frequency
        [NameInMap("frequency")]
        [Validation(Required=true)]
        public long? Frequency { get; set; }

        // silent_minute
        [NameInMap("silent_minute")]
        [Validation(Required=true)]
        public string SilentMinute { get; set; }

        // emergency_copy
        [NameInMap("emergency_copy")]
        [Validation(Required=true)]
        public string EmergencyCopy { get; set; }

        // emergency_url
        [NameInMap("emergency_url")]
        [Validation(Required=true)]
        public string EmergencyUrl { get; set; }

        // time_zone
        [NameInMap("time_zone")]
        [Validation(Required=true)]
        public string TimeZone { get; set; }

        // time_zone_custom
        [NameInMap("time_zone_custom")]
        [Validation(Required=true)]
        public bool? TimeZoneCustom { get; set; }

    }

}
