// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class InitEkytTrustsignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求头
        [NameInMap("head")]
        [Validation(Required=true)]
        public RequestHead Head { get; set; }

        // 签约用户信息
        [NameInMap("sign_user")]
        [Validation(Required=true)]
        public string SignUser { get; set; }

        // 控件key-value
        [NameInMap("rect_id")]
        [Validation(Required=false)]
        public string RectId { get; set; }

        // 签约方案码
        [NameInMap("solution_code")]
        [Validation(Required=true)]
        public string SolutionCode { get; set; }

        // 发起签约的外部流水号
        [NameInMap("out_order_no")]
        [Validation(Required=true)]
        public string OutOrderNo { get; set; }

        // 小程序appId
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 用户授权标识
        [NameInMap("user_authorization")]
        [Validation(Required=true)]
        public string UserAuthorization { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
