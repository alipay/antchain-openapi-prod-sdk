// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 合同信息
    public class BclContractInfo : TeaModel {
        // 签署状态
        // 1.合同待签署：SIGNING 
        // 2.代扣待签署：PROXY_SIGNING 
        // 3.合同拒签：REJECT 
        // 4.代扣拒签：PROXY_REJECT 
        // 5.合同签署失败：SIGN_FAIL 
        // 6.签署完成：FINISH
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public string SignStatus { get; set; }

        // 签署完成的合同文件
        // 如果使用合同服务，只有签署完成才可获取
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

        // 签署长链接，使用租赁宝代扣并且发起订单后才可以查询获取
        [NameInMap("dest_url")]
        [Validation(Required=false)]
        public string DestUrl { get; set; }

        // 签署模式：
        // 模板签署:TEMPLATE_SIGN,使用同模板流程创建合同信息；
        // 原文签署:ORIGINAL_SIGN，使用原来的流程创建合同信息
        [NameInMap("sign_mode")]
        [Validation(Required=false)]
        public string SignMode { get; set; }

    }

}
