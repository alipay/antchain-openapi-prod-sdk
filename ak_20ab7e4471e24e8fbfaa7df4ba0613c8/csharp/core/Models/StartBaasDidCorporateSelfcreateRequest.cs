// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_20ab7e4471e24e8fbfaa7df4ba0613c8.Models
{
    public class StartBaasDidCorporateSelfcreateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 扩展信息
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 公司名称
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 携带自己定义的服务类型
        [NameInMap("services")]
        [Validation(Required=false)]
        public List<DidDocServicesInfo> Services { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 生成的did字符串
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

    }

}
