// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 服务商工作人员列表
    public class IsvWorkerInfoVOList : TeaModel {
        // 服务商下工作人员信息列表
        [NameInMap("isv_worker_info_list")]
        [Validation(Required=true)]
        public List<IsvWorkerInfoVO> IsvWorkerInfoList { get; set; }

    }

}
