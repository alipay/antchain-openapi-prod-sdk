// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // disk spec
    public class DiskSpec : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // providerId
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // iaasType
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // enable
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

        // minSize
        [NameInMap("min_size")]
        [Validation(Required=false)]
        public long? MinSize { get; set; }

        // maxSize
        [NameInMap("max_size")]
        [Validation(Required=false)]
        public long? MaxSize { get; set; }

    }

}
