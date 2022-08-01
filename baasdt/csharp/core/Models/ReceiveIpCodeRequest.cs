// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ReceiveIpCodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 数字凭证的编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 领取用户的ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 领取用户的名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 领取用户的手机号
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 领取用户的位置信息
        [NameInMap("gps")]
        [Validation(Required=false)]
        public string Gps { get; set; }

        // 用户头像地址
        [NameInMap("avatar")]
        [Validation(Required=true)]
        public string Avatar { get; set; }

        // true 发起流转，false 正常领取，默认false
        [NameInMap("flow_en")]
        [Validation(Required=false)]
        public bool? FlowEn { get; set; }

        // 交易单ID（流转订单）、支付宝交易号、交易金额、流转交易平台、平台logo、原持有人ID 等信息，由调用方构造
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
