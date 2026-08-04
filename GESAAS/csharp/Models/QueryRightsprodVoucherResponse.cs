// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class QueryRightsprodVoucherResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户手机号
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 用户openId
        [NameInMap("open_id")]
        [Validation(Required=false)]
        public string OpenId { get; set; }

        // 应用ID
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 权益编码
        [NameInMap("rights_code")]
        [Validation(Required=false)]
        public string RightsCode { get; set; }

        // 权益名称
        [NameInMap("rights_name")]
        [Validation(Required=false)]
        public string RightsName { get; set; }

        // 券实例编码
        [NameInMap("voucher_code")]
        [Validation(Required=false)]
        public string VoucherCode { get; set; }

        // 券状态
        // WAIT_EFFECT：待生效 
        // WAIT_VERIFY：待核销 
        // EXPIRED：已过期 
        // VERIFY_SUCCESS：核销成功（已核销）
        // INVALID：已失效 
        // 公域场景下只会包含以上五种状态，私域场景会包含下方状态基
        // FREEZE：已冻结 
        // VERIFYING：核销处理中 
        // VERIFY_FAIL：核销失败 
        // VERIFY_CANCELING：核销撤销中
        // NO_NEED_VERIFY：无需核销
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
