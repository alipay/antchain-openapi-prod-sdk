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
        // 仅当使用合同服务时必填
        [NameInMap("business_scene")]
        [Validation(Required=false, MaxLength=32)]
        public string BusinessScene { get; set; }

        // 流程中的签署文件信息
        // 本期只支持一个文件
        // 仅当使用合同服务时必填
        [NameInMap("file_info")]
        [Validation(Required=false)]
        public List<BclContractFileInfo> FileInfo { get; set; }

        // 签署失败时的跳转地址
        // 如果不做单独配置，默认与redirect_url一致
        [NameInMap("redirect_url_on_failure")]
        [Validation(Required=false, MaxLength=512)]
        public string RedirectUrlOnFailure { get; set; }

        // 流程结束后的默认重定向地址
        // 默认签署完成停在当前页面
        [NameInMap("redirect_url")]
        [Validation(Required=false, MaxLength=512)]
        public string RedirectUrl { get; set; }

        // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
        [NameInMap("sign_platform")]
        [Validation(Required=false)]
        public string SignPlatform { get; set; }

        // 收款方的ID，调用创建收款方接口获得
        [NameInMap("payee_id")]
        [Validation(Required=false)]
        public string PayeeId { get; set; }

        // 签署模式:
        // 模板签署:TEMPLATE_SIGN,使用同模板流程创建合同信息；
        // 原文签署:ORIGINAL_SIGN，使用原来的流程创建合同信息;
        // 未传值即为(原文签署:ORIGINAL_SIGN)
        [NameInMap("sign_mode")]
        [Validation(Required=false)]
        public string SignMode { get; set; }

    }

}
