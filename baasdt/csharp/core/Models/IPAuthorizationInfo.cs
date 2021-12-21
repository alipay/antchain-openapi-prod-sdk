// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 商品IP授权信息
    public class IPAuthorizationInfo : TeaModel {
        // 授权模式,0普通授权/1独家授权
        [NameInMap("authorization_model")]
        [Validation(Required=false)]
        public List<long?> AuthorizationModel { get; set; }

        // 授权类型，衍生品授权，营销授权，商标授权，数字虚拟授权，其他
        [NameInMap("authorization_type")]
        [Validation(Required=false)]
        public List<string> AuthorizationType { get; set; }

        // 授权范围
        [NameInMap("authorization_scope")]
        [Validation(Required=false)]
        public string AuthorizationScope { get; set; }

        // 授权要求
        [NameInMap("authorization_requirement")]
        [Validation(Required=false)]
        public string AuthorizationRequirement { get; set; }

    }

}
