// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class DetailAuthConfigResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 授权状态
        [NameInMap("auth_status")]
        [Validation(Required=false)]
        public bool? AuthStatus { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // 发起授权页面的url链接
        [NameInMap("start_auth_url")]
        [Validation(Required=false)]
        public string StartAuthUrl { get; set; }

        // 数据源连接器空间id
        [NameInMap("source_space_id")]
        [Validation(Required=false)]
        public string SourceSpaceId { get; set; }

        // 公钥
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

        // 被授权方企业信用代码
        [NameInMap("enterprise_code")]
        [Validation(Required=false)]
        public string EnterpriseCode { get; set; }

        // 主题颜色
        [NameInMap("background_color")]
        [Validation(Required=false)]
        public string BackgroundColor { get; set; }

        // 接入方企业名称
        [NameInMap("target_name")]
        [Validation(Required=false)]
        public string TargetName { get; set; }

        // 被授权应用名称
        [NameInMap("auth_app_name")]
        [Validation(Required=false)]
        public string AuthAppName { get; set; }

        // 已授权数量
        [NameInMap("have_authed_count")]
        [Validation(Required=false)]
        public long? HaveAuthedCount { get; set; }

        // 公司logo
        [NameInMap("enterprise_logo")]
        [Validation(Required=false)]
        public string EnterpriseLogo { get; set; }

        // 已取消授权数量
        [NameInMap("cancel_auth_count")]
        [Validation(Required=false)]
        public long? CancelAuthCount { get; set; }

        // 公司logo访问链接
        [NameInMap("enterprise_logo_url")]
        [Validation(Required=false)]
        public string EnterpriseLogoUrl { get; set; }

        // 用途说明
        [NameInMap("auth_purpose")]
        [Validation(Required=false)]
        public string AuthPurpose { get; set; }

        // 场景描述
        [NameInMap("auth_desc")]
        [Validation(Required=false)]
        public string AuthDesc { get; set; }

        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=false)]
        public string AuthType { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 页面使用范围列表
        [NameInMap("use_scope_list")]
        [Validation(Required=false)]
        public List<string> UseScopeList { get; set; }

        // 授权内容列表
        [NameInMap("auth_content_list")]
        [Validation(Required=false)]
        public List<AuthContent> AuthContentList { get; set; }

        // 协议列表
        [NameInMap("agreement_list")]
        [Validation(Required=false)]
        public List<Agreement> AgreementList { get; set; }

        // 是否使用人脸识别
        [NameInMap("use_facial_recognition")]
        [Validation(Required=false)]
        public bool? UseFacialRecognition { get; set; }

        // C端是否显示凭证数据
        [NameInMap("enable_show_proof_vc")]
        [Validation(Required=false)]
        public bool? EnableShowProofVc { get; set; }

        // C端是否显示授权记录
        [NameInMap("enable_show_auth_record")]
        [Validation(Required=false)]
        public bool? EnableShowAuthRecord { get; set; }

        // 授权成功端内跳转地址
        [NameInMap("inner_success_callback_url")]
        [Validation(Required=false)]
        public string InnerSuccessCallbackUrl { get; set; }

        // 授权成功端外跳转地址
        [NameInMap("outside_success_callback_url")]
        [Validation(Required=false)]
        public string OutsideSuccessCallbackUrl { get; set; }

    }

}
