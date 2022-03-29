// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // 结果码
    public class ResultCode : TeaModel {
        // meta数据id
        [NameInMap("api_meta_id")]
        [Validation(Required=true)]
        public string ApiMetaId { get; set; }

        // api版本id
        [NameInMap("api_version_id")]
        [Validation(Required=true)]
        public string ApiVersionId { get; set; }

        // 结果码
        [NameInMap("internal_code")]
        [Validation(Required=true)]
        public string InternalCode { get; set; }

        // 外部结果码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 返回结果描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 解决错误办法
        [NameInMap("resolution")]
        [Validation(Required=true)]
        public string Resolution { get; set; }

    }

}
