// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidSignatureAgentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 需要进行签名的字符串
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 0 原始数据
        // 1 hash值
        [NameInMap("data_type")]
        [Validation(Required=false)]
        public long? DataType { get; set; }

        // 需要进行代理签名的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

    }

}
