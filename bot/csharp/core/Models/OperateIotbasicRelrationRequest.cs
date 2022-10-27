// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicRelrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备属性关系id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 设备品类名称
        [NameInMap("device_category")]
        [Validation(Required=true)]
        public string DeviceCategory { get; set; }

        // 数据关系类型
        [NameInMap("relation_type")]
        [Validation(Required=true)]
        public string RelationType { get; set; }

        // 厂商名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // TPS980	设备型号
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

        // ADD,EDIT,DELETE，QUERY；选择操作
        [NameInMap("operate")]
        [Validation(Required=true)]
        public string Operate { get; set; }

        // 参数签名校验
        [NameInMap("param_sign")]
        [Validation(Required=false)]
        public string ParamSign { get; set; }

        // 项目空间
        [NameInMap("project_space")]
        [Validation(Required=false)]
        public string ProjectSpace { get; set; }

    }

}
