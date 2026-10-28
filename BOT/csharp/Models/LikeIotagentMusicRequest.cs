// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class LikeIotagentMusicRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体 ID，与client_id至少填1项
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public string AgentId { get; set; }

        // 客户端 ID，与agent_id至少填1项
        [NameInMap("client_id")]
        [Validation(Required=false)]
        public string ClientId { get; set; }

        // 歌曲 ID
        [NameInMap("song_id")]
        [Validation(Required=true)]
        public string SongId { get; set; }

        // 红心操作：true=喜欢，false=取消
        [NameInMap("is_like")]
        [Validation(Required=true)]
        public bool? IsLike { get; set; }

    }

}
