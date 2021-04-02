// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 仓库实体身份附加参数请求结构体，应用在注册/更新API的ThingExtraParams
    public class WarehouseReqModel : TeaModel {
        // 详细地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 面积 平方米单位*1e4
        [NameInMap("area")]
        [Validation(Required=false)]
        public long? Area { get; set; }

        // 海拔 米单位*1e2
        [NameInMap("elevation")]
        [Validation(Required=false)]
        public long? Elevation { get; set; }

        // 仓库高度 米单位*1e2
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 纬度 度数单位*1e9
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public long? Latitude { get; set; }

        // 经度 度数单位*1e9
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public long? Longitude { get; set; }

        // 所在国家，中国
        [NameInMap("nation")]
        [Validation(Required=false)]
        public string Nation { get; set; }

        // 其他信息
        [NameInMap("other_info")]
        [Validation(Required=false)]
        public string OtherInfo { get; set; }

        // 仓库状态, AVAILABLE, IN_USE, DELETED, 自定义
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 仓库类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
