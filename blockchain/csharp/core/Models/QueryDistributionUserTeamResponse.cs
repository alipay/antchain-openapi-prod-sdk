// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDistributionUserTeamResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 一级会员信息
        [NameInMap("members")]
        [Validation(Required=false)]
        public List<DistributionUser> Members { get; set; }

        // 下级用户总数
        [NameInMap("member_num")]
        [Validation(Required=false)]
        public long? MemberNum { get; set; }

        // 一级会员数
        [NameInMap("one_level_member_num")]
        [Validation(Required=false)]
        public long? OneLevelMemberNum { get; set; }

        // 分页查询当前页号
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页查询当前页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 二级会员数
        [NameInMap("two_level_member_num")]
        [Validation(Required=false)]
        public long? TwoLevelMemberNum { get; set; }

    }

}
