// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTHK.Models
{
    // 要素信息
    public class AssetElementInfo : TeaModel {
        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 要素ID
        [NameInMap("element_id")]
        [Validation(Required=true)]
        public string ElementId { get; set; }

        // 要素名称
        [NameInMap("element_name")]
        [Validation(Required=false)]
        public string ElementName { get; set; }

        // 要素类型
        [NameInMap("element_type")]
        [Validation(Required=true)]
        public string ElementType { get; set; }

        // 数据来源渠道， 物理要素非必填；数据要素必填；
        [NameInMap("from_type")]
        [Validation(Required=false)]
        public string FromType { get; set; }

        // 平台领域类型， 物理要素非必填；数据要素必填；
        [NameInMap("data_element_type")]
        [Validation(Required=false)]
        public string DataElementType { get; set; }

        // 属性列表， 物理要素非必填；数据要素必填；
        [NameInMap("property_list")]
        [Validation(Required=false)]
        public string PropertyList { get; set; }

        // 数据上报频率
        [NameInMap("frequency")]
        [Validation(Required=false)]
        public string Frequency { get; set; }

        // 物理要素类型码，包含iot和资管的
        [NameInMap("physics_element_type_code")]
        [Validation(Required=true)]
        public string PhysicsElementTypeCode { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 该要素的存储位置， index代表数据流转顺序，location为库表/logstore名称，remark备注
        [NameInMap("persistent_location")]
        [Validation(Required=false)]
        public string PersistentLocation { get; set; }

        // 要素实例信息，用于捞取最小闭环数据
        [NameInMap("element_instance_config")]
        [Validation(Required=false)]
        public string ElementInstanceConfig { get; set; }

        // 要素实例
        [NameInMap("element_instance_info")]
        [Validation(Required=false)]
        public string ElementInstanceInfo { get; set; }

        // 属性列表来源平台 1.IOT 2.DM 
        [NameInMap("property_source_type")]
        [Validation(Required=false)]
        public long? PropertySourceType { get; set; }

        // 拉取数据字段code请求值
        [NameInMap("property_source_id")]
        [Validation(Required=false)]
        public string PropertySourceId { get; set; }

        // 要素主键字段信息
        [NameInMap("primary_key_info")]
        [Validation(Required=false)]
        public string PrimaryKeyInfo { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
