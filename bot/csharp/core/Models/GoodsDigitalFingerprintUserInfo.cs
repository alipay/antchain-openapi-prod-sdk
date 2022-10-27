// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品数字指纹注册用户信息
    public class GoodsDigitalFingerprintUserInfo : TeaModel {
        // 平台注册用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户角色
        [NameInMap("user_role")]
        [Validation(Required=true)]
        public string UserRole { get; set; }

        // 用户登录id来源
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 作为平台使用方，提供对应的渠道用户id列表
        [NameInMap("relation_user_id_list")]
        [Validation(Required=false)]
        public List<string> RelationUserIdList { get; set; }

    }

}
