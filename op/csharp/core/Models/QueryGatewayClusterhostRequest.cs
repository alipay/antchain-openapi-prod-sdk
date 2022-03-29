// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class QueryGatewayClusterhostRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码
        [NameInMap("product")]
        [Validation(Required=true)]
        public string Product { get; set; }

        // 集群名称，对应productInstanceId
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // api所属套件版本
        [NameInMap("suit_version")]
        [Validation(Required=true)]
        public string SuitVersion { get; set; }

        // api分组名称
        [NameInMap("group_name")]
        [Validation(Required=true)]
        public string GroupName { get; set; }

    }

}
