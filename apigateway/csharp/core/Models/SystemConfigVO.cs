// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // SystemConfigVO
    public class SystemConfigVO : TeaModel {
        // config_key
        [NameInMap("config_key")]
        [Validation(Required=false)]
        public string ConfigKey { get; set; }

        // config_value
        [NameInMap("config_value")]
        [Validation(Required=false)]
        public string ConfigValue { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // gateway_list
        [NameInMap("gateway_list")]
        [Validation(Required=false)]
        public List<GateWayConfigVO> GatewayList { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 创建人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // switch_list
        [NameInMap("switch_list")]
        [Validation(Required=false)]
        public List<SwitchVO> SwitchList { get; set; }

    }

}
