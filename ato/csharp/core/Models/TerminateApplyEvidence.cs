// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 用户解约申请材料
    public class TerminateApplyEvidence : TeaModel {
        // 用户申请解约问题类型
        [NameInMap("terminate_apply_reason")]
        [Validation(Required=false)]
        public string TerminateApplyReason { get; set; }

        // 用户申请解约问题描述
        [NameInMap("terminate_apply_refer")]
        [Validation(Required=false)]
        public string TerminateApplyRefer { get; set; }

        // 用户联系电话
        [NameInMap("user_phone_num")]
        [Validation(Required=false)]
        public string UserPhoneNum { get; set; }

        // 用户申请解约证据（图片、视频）
        [NameInMap("terminate_apply_evidences")]
        [Validation(Required=false)]
        public List<string> TerminateApplyEvidences { get; set; }

        // 用户申请提交材料时间
        [NameInMap("terminate_operate_time")]
        [Validation(Required=false)]
        public string TerminateOperateTime { get; set; }

    }

}
