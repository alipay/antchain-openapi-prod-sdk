// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ImportResult
    public class ImportResult : TeaModel {
        // code
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 覆盖报错的配置
        [NameInMap("error_config")]
        [Validation(Required=false)]
        public string ErrorConfig { get; set; }

        // error_message
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // API的ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // API的名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 覆盖成功的标识
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 覆盖失败的配置名称
        [NameInMap("config_name")]
        [Validation(Required=false)]
        public string ConfigName { get; set; }

    }

}
