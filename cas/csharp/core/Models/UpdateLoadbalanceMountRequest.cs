// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateLoadbalanceMountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // mountMap
        [NameInMap("mount_map")]
        [Validation(Required=false)]
        public List<MapStringToIntegerEntity> MountMap { get; set; }

        // domain
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 是否是同步操作
        [NameInMap("is_sync")]
        [Validation(Required=false)]
        public bool? IsSync { get; set; }

    }

}
