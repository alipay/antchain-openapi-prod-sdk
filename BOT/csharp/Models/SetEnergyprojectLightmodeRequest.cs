// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SetEnergyprojectLightmodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 节能项目编码
        [NameInMap("energy_project_code")]
        [Validation(Required=true)]
        public string EnergyProjectCode { get; set; }

        // 照明项目编码
        [NameInMap("light_project_code")]
        [Validation(Required=false)]
        public string LightProjectCode { get; set; }

        // 运行模式。workday：工作日模式；holiday：节假日模式
        [NameInMap("run_mode")]
        [Validation(Required=true)]
        public string RunMode { get; set; }

    }

}
