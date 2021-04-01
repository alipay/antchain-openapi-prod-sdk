// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ApplyChainCertAntRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=true)]
        public string AntChainId { get; set; }

        // common_name
        [NameInMap("common_name")]
        [Validation(Required=true)]
        public string CommonName { get; set; }

        // consortium_id
        [NameInMap("consortium_id")]
        [Validation(Required=true)]
        public string ConsortiumId { get; set; }

        // country_name
        [NameInMap("country_name")]
        [Validation(Required=true)]
        public string CountryName { get; set; }

        // locality_name
        [NameInMap("locality_name")]
        [Validation(Required=true)]
        public string LocalityName { get; set; }

        // organization_name
        [NameInMap("organization_name")]
        [Validation(Required=true)]
        public string OrganizationName { get; set; }

        // organization_unit_name
        [NameInMap("organization_unit_name")]
        [Validation(Required=true)]
        public string OrganizationUnitName { get; set; }

        // password
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // state_or_province_name
        [NameInMap("state_or_province_name")]
        [Validation(Required=true)]
        public string StateOrProvinceName { get; set; }

    }

}
