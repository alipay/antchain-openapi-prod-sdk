// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同签署流程的配置信息
    public class ContractSignFlowConfig : TeaModel {
        // 回调通知地址 ,默认取项目配置通知地址
        [NameInMap("notice_developer_url")]
        [Validation(Required=false)]
        public string NoticeDeveloperUrl { get; set; }

        // 签署通知和审批通知的通知方式，传 "" 表示不需要通知，传"1"表示短信通知。短信功能需要联系售后开白名单才会生效。
        [NameInMap("notice_type")]
        [Validation(Required=true)]
        public string NoticeType { get; set; }

        // 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
        [NameInMap("redirect_url")]
        [Validation(Required=false)]
        public string RedirectUrl { get; set; }

        // 【该字段已废弃】签署平台，逗号分割，1-开放服务h5，2-支付宝签 ，默认值1
        [NameInMap("sign_platform")]
        [Validation(Required=false)]
        public string SignPlatform { get; set; }

        // 签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致（配合twc.notary.contract.signflow.create接口使用）
        [NameInMap("redirect_url_on_failure")]
        [Validation(Required=false)]
        public string RedirectUrlOnFailure { get; set; }

        // 是否允许自由签署，默认false（配合twc.notary.contract.signflow.create接口使用）
        [NameInMap("free_signature")]
        [Validation(Required=false)]
        public bool? FreeSignature { get; set; }

    }

}
