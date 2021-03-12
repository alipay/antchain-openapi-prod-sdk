// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ApplyChainPublicCertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // bizid
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // common_name
        [NameInMap("common_name")]
        [Validation(Required=false)]
        public string CommonName { get; set; }

        // country_name
        [NameInMap("country_name")]
        [Validation(Required=false)]
        public string CountryName { get; set; }

        // locality_name
        [NameInMap("locality_name")]
        [Validation(Required=false)]
        public string LocalityName { get; set; }

        // organization_name
        [NameInMap("organization_name")]
        [Validation(Required=false)]
        public string OrganizationName { get; set; }

        // organization_unit_name
        [NameInMap("organization_unit_name")]
        [Validation(Required=false)]
        public string OrganizationUnitName { get; set; }

        // password
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // state_or_province_name
        [NameInMap("state_or_province_name")]
        [Validation(Required=false)]
        public string StateOrProvinceName { get; set; }

    }

}
