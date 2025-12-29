// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class UpdateAuthConfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 复用的场景码
        [NameInMap("parent_scene_code")]
        [Validation(Required=false)]
        public string ParentSceneCode { get; set; }

        // 数据源可信空间id
        [NameInMap("source_service_node_id")]
        [Validation(Required=true)]
        public string SourceServiceNodeId { get; set; }

        // 数据源租户id
        [NameInMap("source_tenant_id")]
        [Validation(Required=true)]
        public string SourceTenantId { get; set; }

        // 使用方可信空间id
        [NameInMap("target_service_node_id")]
        [Validation(Required=true)]
        public string TargetServiceNodeId { get; set; }

        // 被授权方企业信用代码
        [NameInMap("auth_enterprise_code")]
        [Validation(Required=true)]
        public string AuthEnterpriseCode { get; set; }

        // 被授权方名称
        [NameInMap("target_name")]
        [Validation(Required=true)]
        public string TargetName { get; set; }

        // 业务应用名称
        [NameInMap("auth_app_name")]
        [Validation(Required=true)]
        public string AuthAppName { get; set; }

        // 客户应用logo的oss key
        [NameInMap("enterprise_logo")]
        [Validation(Required=true)]
        public string EnterpriseLogo { get; set; }

        // 用途说明
        [NameInMap("auth_purpose")]
        [Validation(Required=true)]
        public string AuthPurpose { get; set; }

        // 授权描述
        [NameInMap("auth_desc")]
        [Validation(Required=false)]
        public string AuthDesc { get; set; }

        // 授权形式
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // C端是否显示凭证数据
        [NameInMap("enable_show_proof_vc")]
        [Validation(Required=false)]
        public bool? EnableShowProofVc { get; set; }

        // C端是否显示授权记录
        [NameInMap("enable_show_auth_record")]
        [Validation(Required=false)]
        public bool? EnableShowAuthRecord { get; set; }

        // 授权服务产品列表
        [NameInMap("product_group_list")]
        [Validation(Required=false)]
        public List<ProductProviderGroup> ProductGroupList { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 授权协议
        [NameInMap("agreement_list")]
        [Validation(Required=false)]
        public List<Agreement> AgreementList { get; set; }

        // 主题颜色
        [NameInMap("background_color")]
        [Validation(Required=false)]
        public string BackgroundColor { get; set; }

        // 使用刷脸识别
        [NameInMap("use_facial_recognition")]
        [Validation(Required=false)]
        public bool? UseFacialRecognition { get; set; }

        // 页面使用范围列表
        [NameInMap("use_scope_list")]
        [Validation(Required=false)]
        public List<string> UseScopeList { get; set; }

        // 授权成功端内跳转地址
        [NameInMap("inner_success_callback_url")]
        [Validation(Required=false)]
        public string InnerSuccessCallbackUrl { get; set; }

        // 授权成功端外跳转地址
        [NameInMap("outside_success_callback_url")]
        [Validation(Required=false)]
        public string OutsideSuccessCallbackUrl { get; set; }

        // 公钥
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

        // 发起授权页面的链接
        [NameInMap("start_auth_url")]
        [Validation(Required=false)]
        public string StartAuthUrl { get; set; }

    }

}
