// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // ZoneDto
    public class ZoneDto : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // iaasProviderId
        [NameInMap("iaas_provider_id")]
        [Validation(Required=true)]
        public string IaasProviderId { get; set; }

        // displayName
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // state
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // regionId
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // no
        [NameInMap("no")]
        [Validation(Required=true)]
        public long? No { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // utcCreate
        [NameInMap("utc_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utcModified
        [NameInMap("utc_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

    }

}
