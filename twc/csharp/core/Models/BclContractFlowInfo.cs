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

    }

}
