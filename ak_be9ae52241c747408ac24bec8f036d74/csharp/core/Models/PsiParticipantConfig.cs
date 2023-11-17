// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // psi参与方任务配置信息
    public class PsiParticipantConfig : TeaModel {
        // 参与方所属节点ID
        [NameInMap("party_id")]
        [Validation(Required=true)]
        public string PartyId { get; set; }

        // 该参与方用于求交的匹配列，对于线下fate节点不填写该参数，默认匹配其第一列
        [NameInMap("matched_column")]
        [Validation(Required=false)]
        public string MatchedColumn { get; set; }

        // 参与方输入数据，参考结构体定义
        [NameInMap("input")]
        [Validation(Required=true)]
        public ParticipantInput Input { get; set; }

        // 参与方输出数据，参考结构体定义
        [NameInMap("output")]
        [Validation(Required=false)]
        public ParticipantOutput Output { get; set; }

    }

}
