// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241.Models
{
    // 阿里云联盟返回结果
    public class ALiYunUnion : TeaModel {
        // 联盟内链的集合
        [NameInMap("ant_chains")]
        [Validation(Required=false)]
        public List<ALiYunAntChain> AntChains { get; set; }

        // 联盟信息
        [NameInMap("ant_consortiums")]
        [Validation(Required=false)]
        public List<ALiYunAntConsortium> AntConsortiums { get; set; }

        // 联盟Id
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // is_exist
        [NameInMap("is_exist")]
        [Validation(Required=false)]
        public bool? IsExist { get; set; }

        // 联盟成员信息
        [NameInMap("members")]
        [Validation(Required=false)]
        public List<ALiYunMember> Members { get; set; }

        // 阿里云分页属性
        [NameInMap("pagination")]
        [Validation(Required=false)]
        public ALiYunPagination Pagination { get; set; }

    }

}
