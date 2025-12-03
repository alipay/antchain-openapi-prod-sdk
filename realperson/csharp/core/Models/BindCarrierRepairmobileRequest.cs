// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class BindCarrierRepairmobileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 失联修复初始化的流程ID
        [NameInMap("process_id")]
        [Validation(Required=true)]
        public string ProcessId { get; set; }

        // 身份证号，和失联修复初始化接口身份证号加密方式保持一致
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 修复的手机号排序，例如绑定第一个修复手机号填入1
        [NameInMap("mobile_num")]
        [Validation(Required=true)]
        public string MobileNum { get; set; }

        // 主叫号码
        [NameInMap("mobile_a")]
        [Validation(Required=true)]
        public string MobileA { get; set; }

        // 主叫类型1-手机号码 2-固话
        // 默认为1
        [NameInMap("mobile_type")]
        [Validation(Required=false)]
        public string MobileType { get; set; }

        // 场景值
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 扩展信息，预留字段
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
