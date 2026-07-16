// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateSignFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户协议
        [NameInMap("sign_flow_title")]
        [Validation(Required=true)]
        public string SignFlowTitle { get; set; }

        // 签署有效期毫秒时间戳，不传默认7天有效期
        [NameInMap("sign_validity")]
        [Validation(Required=false)]
        public long? SignValidity { get; set; }

        // 签署完成后的跳转链接
        [NameInMap("redirect_url")]
        [Validation(Required=false)]
        public string RedirectUrl { get; set; }

        // 业务id，可以是订单id或其他业务id
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 签署业务场景
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 签署人列表
        [NameInMap("sign_account_list")]
        [Validation(Required=true)]
        public List<SignAccount> SignAccountList { get; set; }

        // 签署模板列表
        [NameInMap("template_info_list")]
        [Validation(Required=true)]
        public List<TemplateInfo> TemplateInfoList { get; set; }

    }

}
