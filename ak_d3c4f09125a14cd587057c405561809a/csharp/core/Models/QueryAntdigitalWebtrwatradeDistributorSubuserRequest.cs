// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    public class QueryAntdigitalWebtrwatradeDistributorSubuserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 机构id
        [NameInMap("institution_id")]
        [Validation(Required=true)]
        public string InstitutionId { get; set; }

        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

    }

}
