// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // api类型自定义卡点配置
    public class ApiHookConfig : TeaModel {
        // 卡点要调用的api地址
        [NameInMap("post_url")]
        [Validation(Required=true)]
        public string PostUrl { get; set; }

        // 授权码
        [NameInMap("auth_key")]
        [Validation(Required=false)]
        public string AuthKey { get; set; }

        // 接口超时时间，单位ms
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public string Timeout { get; set; }

        // 查询异步卡点接口执行结果api
        [NameInMap("check_url")]
        [Validation(Required=false)]
        public string CheckUrl { get; set; }

    }

}
