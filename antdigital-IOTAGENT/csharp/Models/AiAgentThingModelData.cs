// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // AiAgentThingModelData
    public class AiAgentThingModelData : TeaModel {
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        [NameInMap("feature_id")]
        [Validation(Required=true)]
        public string FeatureId { get; set; }

        [NameInMap("report_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ReportTime { get; set; }

        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
