// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDataauthorizationDirectAuthorizationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务UUID,业务系统唯一标示
        [NameInMap("biz_uid")]
        [Validation(Required=true)]
        public string BizUid { get; set; }

        // 直接授权原因
        [NameInMap("comment")]
        [Validation(Required=true)]
        public string Comment { get; set; }

        // 数据ID
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 过期时间
        [NameInMap("expire")]
        [Validation(Required=true)]
        public long? Expire { get; set; }

        // 扩展参数
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 授权者ID
        [NameInMap("issuer_id")]
        [Validation(Required=true)]
        public string IssuerId { get; set; }

        // 被授予者ID
        [NameInMap("subject_id")]
        [Validation(Required=true)]
        public string SubjectId { get; set; }

    }

}
