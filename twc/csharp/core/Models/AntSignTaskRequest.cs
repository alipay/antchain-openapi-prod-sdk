// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 法务电子签签署任务信息
    public class AntSignTaskRequest : TeaModel {
        // 签署人信息
        [NameInMap("ant_sign_user_info_request_list")]
        [Validation(Required=true)]
        public List<AntSignUserInfoRequest> AntSignUserInfoRequestList { get; set; }

        // 待签署文件列表
        [NameInMap("ant_sign_file_request_list")]
        [Validation(Required=true)]
        public List<AntSignFileRequest> AntSignFileRequestList { get; set; }

        // relatedBusiness	是否关联业务
        [NameInMap("related_business")]
        [Validation(Required=false)]
        public bool? RelatedBusiness { get; set; }

        // 任务描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 业务扩展参数
        [NameInMap("extra_param")]
        [Validation(Required=false)]
        public string ExtraParam { get; set; }

        // 子业务流水号（如果只有单任务，可以跟bizNo填相同的值）
        [NameInMap("sub_biz_no")]
        [Validation(Required=true)]
        public string SubBizNo { get; set; }

        // 业务配置参数，用于展示或隐藏签署功能 默认不传：false
        [NameInMap("sign_config_param")]
        [Validation(Required=false)]
        public string SignConfigParam { get; set; }

    }

}
