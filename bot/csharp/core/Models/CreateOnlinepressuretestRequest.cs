// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateOnlinepressuretestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产线压测任务对象
        // 
        [NameInMap("test_task")]
        [Validation(Required=true)]
        public OnlinePressureTestTask TestTask { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

    }

}
