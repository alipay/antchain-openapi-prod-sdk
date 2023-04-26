// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PagequeryXrXrverificationmodelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 唯一ID，对应线下场code
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 唯一ID，对应线下场名称
        [NameInMap("resource_name")]
        [Validation(Required=false)]
        public string ResourceName { get; set; }

        // 设备sn
        [NameInMap("instance_name")]
        [Validation(Required=false)]
        public string InstanceName { get; set; }

        // 设备did
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 当前页
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 业务类型
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

    }

}
