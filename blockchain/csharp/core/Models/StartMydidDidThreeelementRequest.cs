// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidDidThreeelementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户自有用户的唯一id
        [NameInMap("custumor_uid")]
        [Validation(Required=true, MaxLength=64)]
        public string CustumorUid { get; set; }

        // 实名认证身份证号
        [NameInMap("verify_info_id")]
        [Validation(Required=true, MaxLength=20)]
        public string VerifyInfoId { get; set; }

        // 实名认证用户名
        [NameInMap("verify_info_name")]
        [Validation(Required=true, MaxLength=20)]
        public string VerifyInfoName { get; set; }

        // 电话号码
        [NameInMap("verify_info_phone")]
        [Validation(Required=true, MaxLength=11)]
        public string VerifyInfoPhone { get; set; }

    }

}
