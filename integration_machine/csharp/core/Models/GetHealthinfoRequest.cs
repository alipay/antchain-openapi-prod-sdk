// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    public class GetHealthinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备SN
        // 
        [NameInMap("serial_no")]
        [Validation(Required=true)]
        public string SerialNo { get; set; }

        // 设备厂商
        // 
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 健康身份二维码
        [NameInMap("qr_code")]
        [Validation(Required=true)]
        public string QrCode { get; set; }

        // 防疫信息类型,枚举值如下： 健康信息 health , 疫苗信息 vaccination , 核酸信息 nucleicAcid , 行程信息 travel , 抗原信息 antigen , 场景信息 scene . 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
        [NameInMap("health_types")]
        [Validation(Required=true)]
        public string HealthTypes { get; set; }

        // 通行记录ID
        // 
        [NameInMap("pass_id")]
        [Validation(Required=false)]
        public string PassId { get; set; }

        // 获取健康信息所需扩展参数列表：体温（temperature：36.5）
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public List<QueryHealthInfoExtendedArg> ExtensionInfo { get; set; }

    }

}
