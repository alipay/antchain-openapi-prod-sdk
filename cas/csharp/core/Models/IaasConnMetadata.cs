// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // IaasConnMetadata
    public class IaasConnMetadata : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // iaas_provider_id
        [NameInMap("iaas_provider_id")]
        [Validation(Required=true)]
        public string IaasProviderId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // iaas_conn_type
        [NameInMap("iaas_conn_type")]
        [Validation(Required=true)]
        public string IaasConnType { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // available_features
        [NameInMap("available_features")]
        [Validation(Required=false)]
        public List<string> AvailableFeatures { get; set; }

        // endpoint
        [NameInMap("endpoint")]
        [Validation(Required=true)]
        public string Endpoint { get; set; }

        // region_ids
        [NameInMap("region_ids")]
        [Validation(Required=true)]
        public List<string> RegionIds { get; set; }

        // is_default
        [NameInMap("is_default")]
        [Validation(Required=true)]
        public bool? IsDefault { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

    }

}
