// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class CreateConsoleSceneDomainRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景id
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public string SceneId { get; set; }

        // 用于排查问题
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 客户填自己需要绑定的小程序名称
        [NameInMap("mini_program_name")]
        [Validation(Required=true)]
        public string MiniProgramName { get; set; }

        // 所属平台，微信、支付宝
        [NameInMap("platform")]
        [Validation(Required=true)]
        public string Platform { get; set; }

        // 校验文件的名称
        [NameInMap("check_file_name")]
        [Validation(Required=true)]
        public string CheckFileName { get; set; }

        // 填校验文件里面的内容
        [NameInMap("check_file_body")]
        [Validation(Required=true)]
        public string CheckFileBody { get; set; }

    }

}
