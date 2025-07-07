// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthCaritemsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 唯一场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 来源码
        [NameInMap("source_code")]
        [Validation(Required=true)]
        public string SourceCode { get; set; }

        // 唯一用户标识
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 车牌号
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

        // 车型
        [NameInMap("model_code")]
        [Validation(Required=false)]
        public string ModelCode { get; set; }

    }

}
