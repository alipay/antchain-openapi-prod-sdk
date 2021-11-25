// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SaveAuthCertInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 证书内容，json格式，可以根据证书模板增加自定义字段
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 需要编辑的证书实例id，如果是新增场景则传null
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 创建证书实例后的状态，新增和修改场景默认为3 
        // 3: 编辑中 
        // 2: 待审核
        // 
        // 只有3: 编辑中 状态可以对证书实例进行修改
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
