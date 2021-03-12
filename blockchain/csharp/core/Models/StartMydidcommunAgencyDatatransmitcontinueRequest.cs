// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunAgencyDatatransmitcontinueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用tapp时传输的参数
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

        // 之前触发主动发送数据流程返回的taskid
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 发送者的did声明
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

    }

}
