// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunAgencyDatatransmitstartRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发送者的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 数字资产的owner did
        [NameInMap("owner_did")]
        [Validation(Required=false)]
        public string OwnerDid { get; set; }

        // 具体调用Tapp的参数数组，json格式
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

        // 数据处理tapp id
        [NameInMap("process_tapp_id")]
        [Validation(Required=false)]
        public string ProcessTappId { get; set; }

        // 处理tapp的function
        [NameInMap("process_tapp_method")]
        [Validation(Required=false)]
        public string ProcessTappMethod { get; set; }

        // 读取数据的tapp id
        [NameInMap("read_tapp_id")]
        [Validation(Required=true)]
        public string ReadTappId { get; set; }

        // 读取数据的Tapp中对应的Method
        [NameInMap("read_tapp_method")]
        [Validation(Required=true)]
        public string ReadTappMethod { get; set; }

        // 数据资产传输目标did
        [NameInMap("target_did")]
        [Validation(Required=true)]
        public string TargetDid { get; set; }

        // 发起流程的唯一号，系统将更加这个唯一号保持幂等
        [NameInMap("process_id")]
        [Validation(Required=true)]
        public string ProcessId { get; set; }

    }

}
