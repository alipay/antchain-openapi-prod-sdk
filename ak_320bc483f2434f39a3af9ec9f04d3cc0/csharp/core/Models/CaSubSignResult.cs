// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 用印子任务受理流水
    public class CaSubSignResult : TeaModel {
        // 子业务流水号
        [NameInMap("sub_biz_no")]
        [Validation(Required=false)]
        public string SubBizNo { get; set; }

        // 子任务id
        [NameInMap("sign_task_id")]
        [Validation(Required=false)]
        public string SignTaskId { get; set; }

        // 我方签署方id
        [NameInMap("our_user_id")]
        [Validation(Required=false)]
        public string OurUserId { get; set; }

        // 是否关联业务 true:关联 false：不关联
        [NameInMap("related_business")]
        [Validation(Required=false)]
        public bool? RelatedBusiness { get; set; }

        // 签署链接结果列表
        [NameInMap("ca_sign_url_result_list")]
        [Validation(Required=false)]
        public List<CaSignUrlResult> CaSignUrlResultList { get; set; }

    }

}
