// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateCollectorUploadfileurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 待上传文件的业务类型，
        // 设备心跳数据：COLLECT_MUL
        // 设备业务数据： COLLECT_DEVICE_BIZ_DATA
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

    }

}
