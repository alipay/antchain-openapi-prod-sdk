// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 实体身份更新请求结构体，设备/仓库/空间/组织
    public class ThingsDidUpdateReq : TeaModel {
        // 业务类型，默认空
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 待更新的实体did
        [NameInMap("thing_did")]
        [Validation(Required=true)]
        public string ThingDid { get; set; }

        // 更新内容，参考更新请求不同实体类型结构体，对应不同实体类型不一样
        // 信物链实体附加信息 不同实体身份，有不同的json组织格式，
        // 参考 DeviceRegisterReqModel， SpaceRegisterReqModel， CorporateReqModel， WarehouseReqModel，
        [NameInMap("thing_extra_params")]
        [Validation(Required=false)]
        public string ThingExtraParams { get; set; }

        // 更新后的实体版本
        [NameInMap("thing_version")]
        [Validation(Required=true)]
        public string ThingVersion { get; set; }

    }

}
