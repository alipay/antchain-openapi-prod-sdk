// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetAppopsApplicationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 待查询的应用名称，必须是运维单中包含的应用
        [NameInMap("application_name")]
        [Validation(Required=true)]
        public string ApplicationName { get; set; }

        // 运维单id
        [NameInMap("operation_id")]
        [Validation(Required=true)]
        public string OperationId { get; set; }

    }

}
