// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 券基本信息
    public class VoucherBaseInfoVO : TeaModel {
        // 2088xxxxxx0001
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 手机号
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 权益编号
        [NameInMap("rights_code")]
        [Validation(Required=true)]
        public string RightsCode { get; set; }

        // 权益名称
        [NameInMap("rights_name")]
        [Validation(Required=true)]
        public string RightsName { get; set; }

        // 券码
        [NameInMap("voucher_code")]
        [Validation(Required=true)]
        public string VoucherCode { get; set; }

        // 券状态
        // WAIT_EFFECT：待生效 
        // WAIT_VERIFY：待核销 
        // EXPIRED：已过期 
        // VERIFY_SUCCESS：核销成功（已核销） 
        // 公域场景下只会包含以上四种状态，私域场景会包含下方状态基
        // FREEZE：已冻结 
        // VERIFYING：核销处理中 
        // VERIFY_FAIL：核销失败 
        // VERIFY_CANCELING：核销撤销中
        // INVALID：已失效 
        // NO_NEED_VERIFY：无需核销 
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
