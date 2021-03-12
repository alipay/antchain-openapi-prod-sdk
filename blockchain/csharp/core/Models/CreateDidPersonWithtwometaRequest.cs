// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDidPersonWithtwometaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 身份证号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 扩展字段
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 名称
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
        [NameInMap("owner_uid")]
        [Validation(Required=true)]
        public string OwnerUid { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
