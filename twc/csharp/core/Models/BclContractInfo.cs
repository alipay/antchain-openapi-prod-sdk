// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 合同信息
    public class BclContractInfo : TeaModel {
        // 待签署,SIGNING
        // 拒签,REJECT
        // 签署失败,SIGN_FAIL
        // 签署完成,FINISH
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public string SignStatus { get; set; }

        // 签署完成的合同文件 只有签署完成才有
        [NameInMap("signed_files")]
        [Validation(Required=false)]
        public List<BclFileInfo> SignedFiles { get; set; }

        // 签署链接，使用租赁宝代扣并且发起订单后才可以查询获取
        [NameInMap("sign_url")]
        [Validation(Required=false)]
        public string SignUrl { get; set; }

        // 签署场景
        [NameInMap("business_scene")]
        [Validation(Required=false)]
        public string BusinessScene { get; set; }

        // 合同创建失败原因
        [NameInMap("flow_err_msg")]
        [Validation(Required=false)]
        public string FlowErrMsg { get; set; }

        // 签署区列表
        [NameInMap("sign_field_infos")]
        [Validation(Required=false)]
        public List<BclContractSignFieldInfo> SignFieldInfos { get; set; }

    }

}
