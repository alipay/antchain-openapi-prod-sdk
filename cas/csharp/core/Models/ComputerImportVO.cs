// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // ComputerImportVO
    public class ComputerImportVO : TeaModel {
        // computer iaaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // zone identity
        [NameInMap("zone_iaas_id")]
        [Validation(Required=false)]
        public string ZoneIaasId { get; set; }

        // zone name
        [NameInMap("zone_name")]
        [Validation(Required=false)]
        public string ZoneName { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // private ip
        [NameInMap("private_ip")]
        [Validation(Required=false)]
        public string PrivateIp { get; set; }

        // public ip
        [NameInMap("public_ip")]
        [Validation(Required=false)]
        public string PublicIp { get; set; }

        // elasticIp
        [NameInMap("elastic_ip")]
        [Validation(Required=false)]
        public string ElasticIp { get; set; }

        // vpcIaasId
        [NameInMap("vpc_iaas_id")]
        [Validation(Required=false)]
        public string VpcIaasId { get; set; }

        // joined security group infos
        [NameInMap("joined_security_group")]
        [Validation(Required=false)]
        public List<JoinedSecurityGroupVO> JoinedSecurityGroup { get; set; }

        // creation time
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // import info
        [NameInMap("import_info")]
        [Validation(Required=false)]
        public ImportVO ImportInfo { get; set; }

    }

}
