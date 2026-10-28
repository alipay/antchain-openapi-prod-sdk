// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryTrustiotMiniappResponse : TeaModel {
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

        // 一次性跳转链接：`{渠道登录页地址}?redirectToken=访问令牌`。链接整体 24 小时有效（见 valid_to），令牌一次性消费、用后即失效
        [NameInMap("redirect_url")]
        [Validation(Required=false)]
        public string RedirectUrl { get; set; }

        // 链接生效时间，秒级时间戳
        [NameInMap("valid_from")]
        [Validation(Required=false)]
        public long? ValidFrom { get; set; }

        // 链接过期时间，秒级时间戳，valid_from 起 24 小时。过期后链接不可用
        [NameInMap("valid_to")]
        [Validation(Required=false)]
        public long? ValidTo { get; set; }

        // 清单访问中未命中登记的访问目标回显，结构与 access_scope 条目相同（scene + 设备清单）。部分无效不影响签发，全部无效返回 422（NO_VALID_DEVICE）。主体访问（类型0）恒为空数组
        [NameInMap("invalid_targets")]
        [Validation(Required=false)]
        public List<AccessScopeItem> InvalidTargets { get; set; }

        // 链接实际生效的目标数：范围解析含直接子设备并集、按场景与目标去重后的总数。清单访问与主体访问均返回该口径
        [NameInMap("valid_target_count")]
        [Validation(Required=false)]
        public long? ValidTargetCount { get; set; }

    }

}
