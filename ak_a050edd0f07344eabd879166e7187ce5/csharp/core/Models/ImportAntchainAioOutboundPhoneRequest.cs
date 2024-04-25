// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    public class ImportAntchainAioOutboundPhoneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务ID
        [NameInMap("task_code")]
        [Validation(Required=true)]
        public string TaskCode { get; set; }

        // 收单手机号
        [NameInMap("user_phone")]
        [Validation(Required=true)]
        public string UserPhone { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 幂等控制参数，可以为空。为空时不进行幂等控
        [NameInMap("idempotence_id")]
        [Validation(Required=false)]
        public string IdempotenceId { get; set; }

        // 业务系统在外呼时传入额外参数,json格式
        [NameInMap("biz_ext_info")]
        [Validation(Required=false)]
        public string BizExtInfo { get; set; }

        // 计划外呼执行时间时间戳。默认为当前时间。单位毫秒
        [NameInMap("outcall_timestamp")]
        [Validation(Required=false)]
        public long? OutcallTimestamp { get; set; }

        // 计划外呼过期时间戳。 必须填写，一般为当天22:30左右。单位毫秒
        [NameInMap("expiration_timestamp")]
        [Validation(Required=true)]
        public long? ExpirationTimestamp { get; set; }

    }

}
