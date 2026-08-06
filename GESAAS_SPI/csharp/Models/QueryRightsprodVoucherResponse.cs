// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS_SPI.Models
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

        // 供应商权益编码
        [NameInMap("supply_rights_code")]
        [Validation(Required=false)]
        public string SupplyRightsCode { get; set; }

        // 权益实例ID
        [NameInMap("voucher_code")]
        [Validation(Required=false)]
        public string VoucherCode { get; set; }

        // 权益名称
        [NameInMap("rights_name")]
        [Validation(Required=false)]
        public string RightsName { get; set; }

        // 权益面额
        [NameInMap("face_amount")]
        [Validation(Required=false)]
        public string FaceAmount { get; set; }

        // 剩余可用金额
        [NameInMap("available_amount")]
        [Validation(Required=false)]
        public string AvailableAmount { get; set; }

        // 权益实例状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 过期时间
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public string ExpireTime { get; set; }

        // 生效时间
        [NameInMap("effect_time")]
        [Validation(Required=false)]
        public string EffectTime { get; set; }

    }

}
