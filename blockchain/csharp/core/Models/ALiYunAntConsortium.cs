// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云联盟信息
    public class ALiYunAntConsortium : TeaModel {
        // 链的数量
        [NameInMap("chain_num")]
        [Validation(Required=false)]
        public long? ChainNum { get; set; }

        // 成员数量
        [NameInMap("member_num")]
        [Validation(Required=false)]
        public long? MemberNum { get; set; }

        // 时间戳
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 角色
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

        // 联盟id
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // 状态值
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 联盟名称
        [NameInMap("consortium_name")]
        [Validation(Required=false)]
        public string ConsortiumName { get; set; }

        // 联盟描述
        [NameInMap("consortium_description")]
        [Validation(Required=false)]
        public string ConsortiumDescription { get; set; }

        // 是否为空联盟
        [NameInMap("is_empty_consortium")]
        [Validation(Required=false)]
        public bool? IsEmptyConsortium { get; set; }

    }

}
