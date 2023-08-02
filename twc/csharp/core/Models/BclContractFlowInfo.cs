// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 合同流程信息
    public class BclContractFlowInfo : TeaModel {
        // 合同主题
        // 注：名称不支持以下9个字符：/ \ : * " < > | ？
        [NameInMap("business_scene")]
        [Validation(Required=true, MaxLength=32)]
        public string BusinessScene { get; set; }

        // 流程中的签署文件信息，只支持一个文件
        [NameInMap("file_info")]
        [Validation(Required=true)]
        public List<BclContractFileInfo> FileInfo { get; set; }

        // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
        [NameInMap("sign_platform")]
        [Validation(Required=false, MaxLength=8)]
        public string SignPlatform { get; set; }

        // 收款方的ID，调用创建收款方接口获得
        [NameInMap("payee_id")]
        [Validation(Required=true, MaxLength=32)]
        public string PayeeId { get; set; }

        // 合同签署失败回调地址
        [NameInMap("redirect_url_on_failure")]
        [Validation(Required=false, MaxLength=512)]
        public string RedirectUrlOnFailure { get; set; }

        // 合同签署成功回调地址
        [NameInMap("redirect_url")]
        [Validation(Required=false, MaxLength=512)]
        public string RedirectUrl { get; set; }

    }

}
