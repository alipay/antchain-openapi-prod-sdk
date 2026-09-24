// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackAasBankcardLivenessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码：BANKCARD_LIVENESS
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 请求ID，最大32位字母数字
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 银行卡号（AES加密）
        [NameInMap("bank_card_no")]
        [Validation(Required=true)]
        public string BankCardNo { get; set; }

        // 加密用户ID（身份证号或手机号的AES加密）
        [NameInMap("encrypted_user_id")]
        [Validation(Required=true)]
        public string EncryptedUserId { get; set; }

        // 活跃度结果
        [NameInMap("liveness_result")]
        [Validation(Required=true)]
        public string LivenessResult { get; set; }

        // 活跃度评分（0-100）
        [NameInMap("liveness_score")]
        [Validation(Required=false)]
        public string LivenessScore { get; set; }

        // 原查询日期，格式yyyyMMdd
        [NameInMap("query_date")]
        [Validation(Required=false)]
        public string QueryDate { get; set; }

        // 回调时间，格式yyyyMMddHHmmss
        [NameInMap("callback_time")]
        [Validation(Required=false)]
        public string CallbackTime { get; set; }

        // 扩展信息（JSON字符串）
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
