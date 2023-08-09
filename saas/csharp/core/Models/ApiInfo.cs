// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    // api 信息
    public class ApiInfo : TeaModel {
        // 查询不动产接口
        [NameInMap("api_code")]
        [Validation(Required=true)]
        public string ApiCode { get; set; }

        // api pb文件定义
        [NameInMap("api_protobuf_definition")]
        [Validation(Required=true)]
        public string ApiProtobufDefinition { get; set; }

    }

}
