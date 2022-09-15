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
        [NameInMap("if_put_chain")]
        [Validation(Required=true)]
        public string IfPutChain { get; set; }

        // 是否标准设备-- 设备注册时 判断扩展属性 或展示时 显示扩展属性
        [NameInMap("if_standard_device")]
        [Validation(Required=true)]
        public string IfStandardDevice { get; set; }

        // 是否生成密钥--注册设备时 生成密钥对， 存到 设备公钥(public_key)、deviceSecrect
        [NameInMap("if_generate_screct")]
        [Validation(Required=true)]
        public string IfGenerateScrect { get; set; }

        // 接口地址
        [NameInMap("interface_address")]
        [Validation(Required=false)]
        public string InterfaceAddress { get; set; }

        // 接口参数
        [NameInMap("interface_params")]
        [Validation(Required=false)]
        public string InterfaceParams { get; set; }

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

    }

}
