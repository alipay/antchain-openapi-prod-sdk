// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class StatusBlockchainBotIotagentMusicResponse : TeaModel {
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

        // token 类型，取值范围：NONE=未登录 / ANONYMOUS=匿名 token / FORMAL=正式登录
        [NameInMap("token_type")]
        [Validation(Required=false)]
        public string TokenType { get; set; }

        // 昵称
        [NameInMap("nickname")]
        [Validation(Required=false)]
        public string Nickname { get; set; }

        // 头像 URL
        [NameInMap("avatar_url")]
        [Validation(Required=false)]
        public string AvatarUrl { get; set; }

        // 性别，取值范围：0=未知 / 1=男 / 2=女
        [NameInMap("gender")]
        [Validation(Required=false)]
        public long? Gender { get; set; }

        // VIP 类型，取值范围：FREE=非会员 / BLACK_VIP=黑胶 VIP / SVIP=SVIP / SINGLE_DEVICE=单设备会员
        [NameInMap("vip_type")]
        [Validation(Required=false)]
        public string VipType { get; set; }

        // VIP 到期时间（毫秒时间戳）
        [NameInMap("vip_expire_time")]
        [Validation(Required=false)]
        public long? VipExpireTime { get; set; }

    }

}
