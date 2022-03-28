// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class UpdateDubbridgeInstitutionCreditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 机构请求流水号，用于幂等。行方需确保唯一性
        [NameInMap("serial_no")]
        [Validation(Required=true)]
        public string SerialNo { get; set; }

        // 授信编号，授信申请时同申请单号一致，调额等操作同前授信申请时的授信编号一致
        [NameInMap("credit_no")]
        [Validation(Required=true)]
        public string CreditNo { get; set; }

        // 客户姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // ADJUST_AMT_APPLY|ADJUST_RATE_APPLY|CLEAR_UP_APPLY|FROZEN_APPLY|UN_FROZEN_APPLY
        [NameInMap("apply_type")]
        [Validation(Required=true)]
        public string ApplyType { get; set; }

        // 基础固额-申请调整值，单位分，机构发起调额场景下有值
        [NameInMap("credit_amount")]
        [Validation(Required=false)]
        public string CreditAmount { get; set; }

        // 年利率-申请调整值，机构发起调价场景下有值
        [NameInMap("credit_rate")]
        [Validation(Required=false)]
        public string CreditRate { get; set; }

        // 申请来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 机构申请原因码
        [NameInMap("reason_code")]
        [Validation(Required=true)]
        public string ReasonCode { get; set; }

        // 机构发起原因描述
        [NameInMap("reason_msg")]
        [Validation(Required=true)]
        public string ReasonMsg { get; set; }

        // 透传授信阶段天枢字段，json格式
        [NameInMap("ext_info_ts")]
        [Validation(Required=true)]
        public string ExtInfoTs { get; set; }

        // 扩展信息，json格式
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

    }

}
