// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicControlconfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备品类编码
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // 厂商
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 管控模式
        [NameInMap("control_model")]
        [Validation(Required=true)]
        public string ControlModel { get; set; }

        // 是否上链--注册设备后需上链存证，记录存证hash
        [NameInMap("is_register_notify")]
        [Validation(Required=true)]
        public string IsRegisterNotify { get; set; }

        // 是否标准设备-- 设备注册时 判断扩展属性 或展示时 显示扩展属性
        [NameInMap("is_standard")]
        [Validation(Required=true)]
        public string IsStandard { get; set; }

        // 是否生成密钥--注册设备时 生成密钥对， 存到 设备公钥(public_key)、deviceSecrect
        [NameInMap("is_gen_secret")]
        [Validation(Required=true)]
        public string IsGenSecret { get; set; }

        // 接口地址
        [NameInMap("service_provider")]
        [Validation(Required=false)]
        public string ServiceProvider { get; set; }

        // 接口参数
        [NameInMap("control_param")]
        [Validation(Required=false)]
        public string ControlParam { get; set; }

        // 操作类型
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 操作人id
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 参数签名校验
        [NameInMap("param_sign")]
        [Validation(Required=true)]
        public string ParamSign { get; set; }

        // 是否接入安全认证
        [NameInMap("is_support_sec")]
        [Validation(Required=true)]
        public string IsSupportSec { get; set; }

        // 设备规格ID
        [NameInMap("device_specs")]
        [Validation(Required=false)]
        public long? DeviceSpecs { get; set; }

        // 厂商ID
        [NameInMap("corp_id")]
        [Validation(Required=true)]
        public long? CorpId { get; set; }

    }

}
