// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunAgencyDataapplicationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请的数据ID，该字段由两部分组成ownerdid#service-id(did doc中表示对应数据资产的serviceid)
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 主动发起申请数据流程的请求者did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 申请数据时增加的说明，比如说明本次申请数据的原因，等描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 申请者在申请数据的时候，申明自己将使用那种方式处理申请到的数据。如果该字段为0表示要得到原始数据。
        // 该字段形式与dataId类似
        [NameInMap("process_data_id")]
        [Validation(Required=false)]
        public string ProcessDataId { get; set; }

        // 发起申请的申请id，系统将基于该id保持幂等
        [NameInMap("process_id")]
        [Validation(Required=true, MaxLength=128)]
        public string ProcessId { get; set; }

        // 数据申请到之后最终发送给谁的did
        [NameInMap("target_did")]
        [Validation(Required=true)]
        public string TargetDid { get; set; }

    }

}
