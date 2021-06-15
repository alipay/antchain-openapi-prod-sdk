// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class ExecWithdrawCreateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // project_id，合约对应的项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 兑现Token个数
        [NameInMap("withdraw_token")]
        [Validation(Required=true)]
        public string WithdrawToken { get; set; }

        // 兑现总额 单位：分
        [NameInMap("withdraw_amount_cent")]
        [Validation(Required=true)]
        public long? WithdrawAmountCent { get; set; }

        // Token单价 单位：分
        [NameInMap("withdraw_token_price_cent")]
        [Validation(Required=true)]
        public long? WithdrawTokenPriceCent { get; set; }

        // 业务单号，同一调用方全局唯一
        [NameInMap("withdraw_request_id")]
        [Validation(Required=true)]
        public string WithdrawRequestId { get; set; }

        // 用户账号类型：PHONE / ALIPAY_LOGON_ID / ALIPAY_UID
        [NameInMap("user_id_type")]
        [Validation(Required=true)]
        public string UserIdType { get; set; }

        // 回跳地址（签约税优使用，使用小程序页面地址）
        [NameInMap("back_url")]
        [Validation(Required=true)]
        public string BackUrl { get; set; }

        // 支付宝用户唯一标识
        [NameInMap("user_id_no")]
        [Validation(Required=true)]
        public string UserIdNo { get; set; }

    }

}
