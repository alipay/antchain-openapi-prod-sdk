// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // TaskVO用Resource字段
    public class Resource : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // instance_charge_type
        [NameInMap("instance_charge_type")]
        [Validation(Required=false)]
        public string InstanceChargeType { get; set; }

        // expiredTime
        [NameInMap("expired_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpiredTime { get; set; }

        // auto_renew
        [NameInMap("auto_renew")]
        [Validation(Required=false)]
        public bool? AutoRenew { get; set; }

        // autoRenewPeriod
        [NameInMap("auto_renew_period")]
        [Validation(Required=false)]
        public long? AutoRenewPeriod { get; set; }

        // iaas_id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // iaas_type
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // zone_id
        [NameInMap("zone_id")]
        [Validation(Required=true)]
        public string ZoneId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

    }

}
