// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 播放列表实体类
    public class PlayListEntity : TeaModel {
        // 播放列表名称，可包含多个视频
        [NameInMap("play_list_name")]
        [Validation(Required=true)]
        public string PlayListName { get; set; }

        // 表示授权类型，仅支持EXCLUSIVE，表示独家
        // 默认EXCLUSIVE
        [NameInMap("authorize_type")]
        [Validation(Required=false)]
        public string AuthorizeType { get; set; }

        // 授权类型范围，仅支持OVERSEA，表示全海外
        // 默认OVERSEA
        [NameInMap("authorize_scope_type")]
        [Validation(Required=false)]
        public string AuthorizeScopeType { get; set; }

        // 维权类型，仅支持CONTAIN_PROTECT，表示包含维权
        // 默认CONTAIN_PROTECT
        [NameInMap("protect_rights_type")]
        [Validation(Required=false)]
        public string ProtectRightsType { get; set; }

        // 维权类型范围，仅支持OVERSEA，表示全海外
        // 默认OVERSEA
        [NameInMap("protect_rights_scope_type")]
        [Validation(Required=false)]
        public string ProtectRightsScopeType { get; set; }

        // 内容授权开始日期yyyy-MM-dd
        [NameInMap("authorization_start_date")]
        [Validation(Required=true)]
        public string AuthorizationStartDate { get; set; }

        // 内容授权时长,单位：年，目前支持1~3年，
        // 注意结束时间即开始时间 + 授权时长 不能早于当前时间
        [NameInMap("authorization_time_length")]
        [Validation(Required=true)]
        public long? AuthorizationTimeLength { get; set; }

        // 内容授权平台列表：
        //        默认授权平台都会进行运营，当前仅支持YOUTUBE
        [NameInMap("auth_platform")]
        [Validation(Required=false)]
        public List<string> AuthPlatform { get; set; }

    }

}
