// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241.Models
{
    // 阿里云子链检查结果
    public class ALiYunChainSubnetCheck : TeaModel {
        // 检查结果
        [NameInMap("check_result")]
        [Validation(Required=false)]
        public string CheckResult { get; set; }

        // 子链成员列表
        [NameInMap("consortium_member_list")]
        [Validation(Required=false)]
        public List<string> ConsortiumMemberList { get; set; }

        // 节点信息列表
        [NameInMap("chain_node_info_list")]
        [Validation(Required=false)]
        public List<ALiYunChainNodeInfo> ChainNodeInfoList { get; set; }

        // 联盟管理员
        [NameInMap("consortium_admin")]
        [Validation(Required=false)]
        public bool? ConsortiumAdmin { get; set; }

        // 子链成员列表
        [NameInMap("consortium_member_info_list")]
        [Validation(Required=false)]
        public List<ALiYunMember> ConsortiumMemberInfoList { get; set; }

        // 分页信息
        [NameInMap("pagination")]
        [Validation(Required=false)]
        public ALiYunPagination Pagination { get; set; }

    }

}
