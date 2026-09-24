// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryAasDataBankcardlivenessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码：BANKCARD_LIVENESS
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 请求ID，最大32位字母数字，客户生成保证唯一
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 身份证号（AES加密），与mobile_no二选一
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 身份类型：ID_CARD（默认）/PASSPORT
        [NameInMap("id_type")]
        [Validation(Required=false)]
        public string IdType { get; set; }

        // 手机号（AES加密），与id_number二选一
        [NameInMap("mobile_no")]
        [Validation(Required=false)]
        public string MobileNo { get; set; }

        // 姓名（AES加密）
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 银行编码列表（JSONArray字符串）
        [NameInMap("bank_code")]
        [Validation(Required=true)]
        public string BankCode { get; set; }

        // 查询卡种：1-借记卡+贷记卡（默认），2-借记卡，3-贷记卡
        [NameInMap("bank_card_type")]
        [Validation(Required=false)]
        public string BankCardType { get; set; }

        // 扩展字段-版本号
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
