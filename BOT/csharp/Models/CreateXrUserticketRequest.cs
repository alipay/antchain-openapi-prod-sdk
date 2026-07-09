// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateXrUserticketRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 所属业务
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 购买的通行证列表详情
        [NameInMap("xr_user_ticket_list")]
        [Validation(Required=true)]
        public List<XrUserTicketInfo> XrUserTicketList { get; set; }

    }

}
