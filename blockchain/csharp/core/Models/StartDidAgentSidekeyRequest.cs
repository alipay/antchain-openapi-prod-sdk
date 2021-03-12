// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidAgentSidekeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 指定did进行外键关联
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
        [NameInMap("indexs")]
        [Validation(Required=true)]
        public List<string> Indexs { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
