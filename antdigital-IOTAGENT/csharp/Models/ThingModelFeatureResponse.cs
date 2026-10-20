// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // ThingModelFeatureResponse
    public class ThingModelFeatureResponse : TeaModel {
        [NameInMap("feature_id")]
        [Validation(Required=true)]
        public string FeatureId { get; set; }

        [NameInMap("identifier")]
        [Validation(Required=true)]
        public string Identifier { get; set; }

        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("event_properties")]
        [Validation(Required=true)]
        public string EventProperties { get; set; }

    }

}
