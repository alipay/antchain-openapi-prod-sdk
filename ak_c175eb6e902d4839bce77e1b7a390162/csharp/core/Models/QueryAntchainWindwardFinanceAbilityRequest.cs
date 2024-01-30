// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_c175eb6e902d4839bce77e1b7a390162.Models
{
    public class QueryAntchainWindwardFinanceAbilityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 大经分
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 姓名
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 手机号
        [NameInMap("tel_no")]
        [Validation(Required=false)]
        public string TelNo { get; set; }

        // true
        [NameInMap("encrypt")]
        [Validation(Required=false)]
        public bool? Encrypt { get; set; }

    }

}
