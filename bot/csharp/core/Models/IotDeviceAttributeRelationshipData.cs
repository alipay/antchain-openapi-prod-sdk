// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备属性关系对象
    public class IotDeviceAttributeRelationshipData : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 设备品类名称
        [NameInMap("device_category")]
        [Validation(Required=true)]
        public string DeviceCategory { get; set; }

        // 关系类型
        [NameInMap("relation_type")]
        [Validation(Required=true)]
        public string RelationType { get; set; }

        // 厂商名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 设备规格
        [NameInMap("device_specs")]
        [Validation(Required=false)]
        public string DeviceSpecs { get; set; }

        // 硬件模块
        [NameInMap("hardware_module")]
        [Validation(Required=false)]
        public string HardwareModule { get; set; }

    }

}
