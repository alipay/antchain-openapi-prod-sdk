// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateDidPersonExtensionservicewithsidekeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 新增的外键
        [NameInMap("add_indexs")]
        [Validation(Required=false)]
        public List<string> AddIndexs { get; set; }

        // 去掉哪些外键
        [NameInMap("delete_indexs")]
        [Validation(Required=false)]
        public List<string> DeleteIndexs { get; set; }

        // 需要更新的did doc对应的did字段；该did必须为调用者自己的did，或者托管给调用者的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 修改后的全量扩展字段
        // 
        [NameInMap("extension")]
        [Validation(Required=true)]
        public string Extension { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
