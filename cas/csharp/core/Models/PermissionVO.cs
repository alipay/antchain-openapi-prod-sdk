// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // PermissionVO
    public class PermissionVO : TeaModel {
        // authorizedCidrIp
        [NameInMap("authorized_cidr_ip")]
        [Validation(Required=false)]
        public string AuthorizedCidrIp { get; set; }

        // authorize_type
        [NameInMap("authorize_type")]
        [Validation(Required=false)]
        public string AuthorizeType { get; set; }

        // direction
        [NameInMap("direction")]
        [Validation(Required=false)]
        public string Direction { get; set; }

        // endPort
        [NameInMap("end_port")]
        [Validation(Required=false)]
        public long? EndPort { get; set; }

        // ipProtocol
        [NameInMap("ip_protocol")]
        [Validation(Required=false)]
        public string IpProtocol { get; set; }

        // nicType
        [NameInMap("nic_type")]
        [Validation(Required=false)]
        public string NicType { get; set; }

        // policy
        [NameInMap("policy")]
        [Validation(Required=false)]
        public string Policy { get; set; }

        // priority
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

        // securityGroupId
        [NameInMap("security_group_id")]
        [Validation(Required=false)]
        public string SecurityGroupId { get; set; }

        // startPort
        [NameInMap("start_port")]
        [Validation(Required=false)]
        public long? StartPort { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}
