// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 联盟信息
    public class LeagueInfo : TeaModel {
        // 时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 联盟id
        [NameInMap("league_id")]
        [Validation(Required=false)]
        public string LeagueId { get; set; }

        // 联盟名称
        [NameInMap("league_name")]
        [Validation(Required=false)]
        public string LeagueName { get; set; }

        // 联盟描述
        [NameInMap("league_desc")]
        [Validation(Required=false)]
        public string LeagueDesc { get; set; }

        // 联盟对应的物权平台产品
        [NameInMap("product_version")]
        [Validation(Required=false)]
        public string ProductVersion { get; set; }

    }

}
