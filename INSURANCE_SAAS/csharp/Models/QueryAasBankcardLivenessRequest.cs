// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryAasBankcardLivenessRequest : TeaModel {
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

        // 银行卡号（AES加密）
        [NameInMap("bank_card_no")]
        [Validation(Required=true)]
        public string BankCardNo { get; set; }

        // 银行卡类型：1-借记卡+贷记卡（默认），2-借记卡，3-贷记卡
        [NameInMap("bank_card_type")]
        [Validation(Required=false)]
        public string BankCardType { get; set; }

        // 加密类型
        [NameInMap("encryption_type")]
        [Validation(Required=false)]
        public string EncryptionType { get; set; }

        // 加密用户ID（身份证号或手机号的AES加密）
        [NameInMap("encrypted_user_id")]
        [Validation(Required=true)]
        public string EncryptedUserId { get; set; }

        // 查询日期，格式yyyyMMdd
        [NameInMap("query_date")]
        [Validation(Required=false)]
        public string QueryDate { get; set; }

        // 扩展信息（JSON字符串）
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
