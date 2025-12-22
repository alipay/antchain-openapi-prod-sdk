// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 子任务信息
    public class SubAntSignResult : TeaModel {
        // 子业务流水号
        [NameInMap("sub_biz_no")]
        [Validation(Required=true)]
        public string SubBizNo { get; set; }

        // 子任务流水号
        [NameInMap("sign_task_id")]
        [Validation(Required=false)]
        public string SignTaskId { get; set; }

        // 我方userId
        [NameInMap("our_user_id")]
        [Validation(Required=false)]
        public string OurUserId { get; set; }

        // 是否关联业务
        [NameInMap("related_business")]
        [Validation(Required=false)]
        public bool? RelatedBusiness { get; set; }

        // 签署链接
        [NameInMap("ant_sign_url_result_list")]
        [Validation(Required=true)]
        public List<AntSignUrlResult> AntSignUrlResultList { get; set; }

    }

}
