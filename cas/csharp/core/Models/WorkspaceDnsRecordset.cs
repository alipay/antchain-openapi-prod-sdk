// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // WorkspaceDnsRecordset
    public class WorkspaceDnsRecordset : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // iaasId
        [NameInMap("iaas_id")]
        [Validation(Required=true)]
        public string IaasId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // dns_provider_id
        [NameInMap("dns_provider_id")]
        [Validation(Required=true)]
        public string DnsProviderId { get; set; }

        // dns_network_type
        [NameInMap("dns_network_type")]
        [Validation(Required=false)]
        public string DnsNetworkType { get; set; }

        // device_network_address_type
        [NameInMap("device_network_address_type")]
        [Validation(Required=false)]
        public string DeviceNetworkAddressType { get; set; }

        // 绑定的资源的类型COMPUTER或LOAD_BALANCER
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // ttl
        [NameInMap("ttl")]
        [Validation(Required=true)]
        public long? Ttl { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // resource_id
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // resource_iaas_id
        [NameInMap("resource_iaas_id")]
        [Validation(Required=false)]
        public string ResourceIaasId { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

    }

}
