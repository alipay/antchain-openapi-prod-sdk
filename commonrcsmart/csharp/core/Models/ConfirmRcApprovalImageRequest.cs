// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMONRCSMART.Models
{
    public class ConfirmRcApprovalImageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 审核场景列表
        [NameInMap("scenes")]
        [Validation(Required=true)]
        public List<string> Scenes { get; set; }

        // 审核文件内容
        [NameInMap("data_vo")]
        [Validation(Required=true)]
        public DataVo DataVo { get; set; }

        // 登录账号；默认使用主账号
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

    }

}
