// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // RegionDto
    public class RegionDto : TeaModel {
        // availableNetworkTypes
        [NameInMap("available_network_types")]
        [Validation(Required=true)]
        public List<string> AvailableNetworkTypes { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // displayName
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // iaasProviderId
        [NameInMap("iaas_provider_id")]
        [Validation(Required=true)]
        public string IaasProviderId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // networkType
        [NameInMap("network_type")]
        [Validation(Required=true)]
        public string NetworkType { get; set; }

        // state
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // utcCreate
        [NameInMap("utc_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // utcModified
        [NameInMap("utc_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // zoneDtos
        [NameInMap("zone_dtos")]
        [Validation(Required=true)]
        public List<ZoneDto> ZoneDtos { get; set; }

    }

}
