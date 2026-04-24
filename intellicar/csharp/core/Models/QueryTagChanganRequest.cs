// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class QueryTagChanganRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 请求唯一ID（UUID生成即可）
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 系统
        [NameInMap("os")]
        [Validation(Required=false)]
        public string Os { get; set; }

        // 1表示定制标签查询
        // 2表示标准标签查询
        // 3表示全量标签查询
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 设备信息
        [NameInMap("device_info_list")]
        [Validation(Required=true)]
        public DeviceBean DeviceInfoList { get; set; }

    }

}
