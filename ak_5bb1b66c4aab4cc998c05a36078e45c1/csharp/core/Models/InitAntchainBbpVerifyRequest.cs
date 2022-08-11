// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    public class InitAntchainBbpVerifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
        [NameInMap("verify_scene")]
        [Validation(Required=true)]
        public GwVerifyScene VerifyScene { get; set; }

        // 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 调用方传入，存放业务扩展参数（callback参数也写入此）
        [NameInMap("extern_params")]
        [Validation(Required=false)]
        public List<NameValuePair> ExternParams { get; set; }

        // 调用方传入，指定核身完成后的回调类型
        [NameInMap("callback_enum")]
        [Validation(Required=false)]
        public string CallbackEnum { get; set; }

        // 核身产品列表
        [NameInMap("validate_flows")]
        [Validation(Required=true)]
        public List<GwValidateProduct> ValidateFlows { get; set; }

    }

}
