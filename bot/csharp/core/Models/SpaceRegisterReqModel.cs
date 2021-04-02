// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 空间实体身份附加参数请求结构体，应用在注册/更新API的ThingExtraParams
    public class SpaceRegisterReqModel : TeaModel {
        // 面积 平方米单位*1e4	
        [NameInMap("area")]
        [Validation(Required=false)]
        public long? Area { get; set; }

        // 自定义业务类型，例如选择：危险品/非危险品/食品
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 海拔 米单位*1e2
        [NameInMap("elevation")]
        [Validation(Required=false)]
        public long? Elevation { get; set; }

        // 高度 米单位*1e2	
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

        // 自定义其他字段
        [NameInMap("other_info")]
        [Validation(Required=false)]
        public string OtherInfo { get; set; }

        // 父类型，在业务中自定义关联，例如仓位的父节点是仓库
        [NameInMap("parent_did")]
        [Validation(Required=false)]
        public string ParentDid { get; set; }

        // 可填入符合w3c did定义的服务节点
        [NameInMap("service_endpoint")]
        [Validation(Required=false)]
        public string ServiceEndpoint { get; set; }

        // 空间状态，自定义	
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 空间类型，例如冷藏/冷冻/通道/平面/立体	
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
