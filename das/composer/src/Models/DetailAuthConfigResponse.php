<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DetailAuthConfigResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 授权状态
    /**
     * @var bool
     */
    public $authStatus;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 发起授权页面的url链接
    /**
     * @var string
     */
    public $startAuthUrl;

    // 数据源连接器空间id
    /**
     * @var string
     */
    public $sourceSpaceId;

    // 公钥
    /**
     * @var string
     */
    public $publicKey;

    // 被授权方企业信用代码
    /**
     * @var string
     */
    public $enterpriseCode;

    // 主题颜色
    /**
     * @var string
     */
    public $backgroundColor;

    // 接入方企业名称
    /**
     * @var string
     */
    public $targetName;

    // 被授权应用名称
    /**
     * @var string
     */
    public $authAppName;

    // 已授权数量
    /**
     * @var int
     */
    public $haveAuthedCount;

    // 公司logo
    /**
     * @var string
     */
    public $enterpriseLogo;

    // 已取消授权数量
    /**
     * @var int
     */
    public $cancelAuthCount;

    // 公司logo访问链接
    /**
     * @var string
     */
    public $enterpriseLogoUrl;

    // 用途说明
    /**
     * @var string
     */
    public $authPurpose;

    // 场景描述
    /**
     * @var string
     */
    public $authDesc;

    // 授权类型
    /**
     * @var string
     */
    public $authType;

    // 用户类型
    /**
     * @var string
     */
    public $userType;

    // 页面使用范围列表
    /**
     * @var string[]
     */
    public $useScopeList;

    // 授权内容列表
    /**
     * @var AuthContent[]
     */
    public $authContentList;

    // 协议列表
    /**
     * @var Agreement[]
     */
    public $agreementList;

    // 是否使用人脸识别
    /**
     * @var bool
     */
    public $useFacialRecognition;

    // C端是否显示凭证数据
    /**
     * @var bool
     */
    public $enableShowProofVc;

    // C端是否显示授权记录
    /**
     * @var bool
     */
    public $enableShowAuthRecord;

    // 授权成功端内跳转地址
    /**
     * @var string
     */
    public $innerSuccessCallbackUrl;

    // 授权成功端外跳转地址
    /**
     * @var string
     */
    public $outsideSuccessCallbackUrl;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'authStatus'                => 'auth_status',
        'sceneCode'                 => 'scene_code',
        'startAuthUrl'              => 'start_auth_url',
        'sourceSpaceId'             => 'source_space_id',
        'publicKey'                 => 'public_key',
        'enterpriseCode'            => 'enterprise_code',
        'backgroundColor'           => 'background_color',
        'targetName'                => 'target_name',
        'authAppName'               => 'auth_app_name',
        'haveAuthedCount'           => 'have_authed_count',
        'enterpriseLogo'            => 'enterprise_logo',
        'cancelAuthCount'           => 'cancel_auth_count',
        'enterpriseLogoUrl'         => 'enterprise_logo_url',
        'authPurpose'               => 'auth_purpose',
        'authDesc'                  => 'auth_desc',
        'authType'                  => 'auth_type',
        'userType'                  => 'user_type',
        'useScopeList'              => 'use_scope_list',
        'authContentList'           => 'auth_content_list',
        'agreementList'             => 'agreement_list',
        'useFacialRecognition'      => 'use_facial_recognition',
        'enableShowProofVc'         => 'enable_show_proof_vc',
        'enableShowAuthRecord'      => 'enable_show_auth_record',
        'innerSuccessCallbackUrl'   => 'inner_success_callback_url',
        'outsideSuccessCallbackUrl' => 'outside_success_callback_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->startAuthUrl) {
            $res['start_auth_url'] = $this->startAuthUrl;
        }
        if (null !== $this->sourceSpaceId) {
            $res['source_space_id'] = $this->sourceSpaceId;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->enterpriseCode) {
            $res['enterprise_code'] = $this->enterpriseCode;
        }
        if (null !== $this->backgroundColor) {
            $res['background_color'] = $this->backgroundColor;
        }
        if (null !== $this->targetName) {
            $res['target_name'] = $this->targetName;
        }
        if (null !== $this->authAppName) {
            $res['auth_app_name'] = $this->authAppName;
        }
        if (null !== $this->haveAuthedCount) {
            $res['have_authed_count'] = $this->haveAuthedCount;
        }
        if (null !== $this->enterpriseLogo) {
            $res['enterprise_logo'] = $this->enterpriseLogo;
        }
        if (null !== $this->cancelAuthCount) {
            $res['cancel_auth_count'] = $this->cancelAuthCount;
        }
        if (null !== $this->enterpriseLogoUrl) {
            $res['enterprise_logo_url'] = $this->enterpriseLogoUrl;
        }
        if (null !== $this->authPurpose) {
            $res['auth_purpose'] = $this->authPurpose;
        }
        if (null !== $this->authDesc) {
            $res['auth_desc'] = $this->authDesc;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->useScopeList) {
            $res['use_scope_list'] = $this->useScopeList;
        }
        if (null !== $this->authContentList) {
            $res['auth_content_list'] = [];
            if (null !== $this->authContentList && \is_array($this->authContentList)) {
                $n = 0;
                foreach ($this->authContentList as $item) {
                    $res['auth_content_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->agreementList) {
            $res['agreement_list'] = [];
            if (null !== $this->agreementList && \is_array($this->agreementList)) {
                $n = 0;
                foreach ($this->agreementList as $item) {
                    $res['agreement_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->useFacialRecognition) {
            $res['use_facial_recognition'] = $this->useFacialRecognition;
        }
        if (null !== $this->enableShowProofVc) {
            $res['enable_show_proof_vc'] = $this->enableShowProofVc;
        }
        if (null !== $this->enableShowAuthRecord) {
            $res['enable_show_auth_record'] = $this->enableShowAuthRecord;
        }
        if (null !== $this->innerSuccessCallbackUrl) {
            $res['inner_success_callback_url'] = $this->innerSuccessCallbackUrl;
        }
        if (null !== $this->outsideSuccessCallbackUrl) {
            $res['outside_success_callback_url'] = $this->outsideSuccessCallbackUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailAuthConfigResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['start_auth_url'])) {
            $model->startAuthUrl = $map['start_auth_url'];
        }
        if (isset($map['source_space_id'])) {
            $model->sourceSpaceId = $map['source_space_id'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['enterprise_code'])) {
            $model->enterpriseCode = $map['enterprise_code'];
        }
        if (isset($map['background_color'])) {
            $model->backgroundColor = $map['background_color'];
        }
        if (isset($map['target_name'])) {
            $model->targetName = $map['target_name'];
        }
        if (isset($map['auth_app_name'])) {
            $model->authAppName = $map['auth_app_name'];
        }
        if (isset($map['have_authed_count'])) {
            $model->haveAuthedCount = $map['have_authed_count'];
        }
        if (isset($map['enterprise_logo'])) {
            $model->enterpriseLogo = $map['enterprise_logo'];
        }
        if (isset($map['cancel_auth_count'])) {
            $model->cancelAuthCount = $map['cancel_auth_count'];
        }
        if (isset($map['enterprise_logo_url'])) {
            $model->enterpriseLogoUrl = $map['enterprise_logo_url'];
        }
        if (isset($map['auth_purpose'])) {
            $model->authPurpose = $map['auth_purpose'];
        }
        if (isset($map['auth_desc'])) {
            $model->authDesc = $map['auth_desc'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['use_scope_list'])) {
            if (!empty($map['use_scope_list'])) {
                $model->useScopeList = $map['use_scope_list'];
            }
        }
        if (isset($map['auth_content_list'])) {
            if (!empty($map['auth_content_list'])) {
                $model->authContentList = [];
                $n                      = 0;
                foreach ($map['auth_content_list'] as $item) {
                    $model->authContentList[$n++] = null !== $item ? AuthContent::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['agreement_list'])) {
            if (!empty($map['agreement_list'])) {
                $model->agreementList = [];
                $n                    = 0;
                foreach ($map['agreement_list'] as $item) {
                    $model->agreementList[$n++] = null !== $item ? Agreement::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['use_facial_recognition'])) {
            $model->useFacialRecognition = $map['use_facial_recognition'];
        }
        if (isset($map['enable_show_proof_vc'])) {
            $model->enableShowProofVc = $map['enable_show_proof_vc'];
        }
        if (isset($map['enable_show_auth_record'])) {
            $model->enableShowAuthRecord = $map['enable_show_auth_record'];
        }
        if (isset($map['inner_success_callback_url'])) {
            $model->innerSuccessCallbackUrl = $map['inner_success_callback_url'];
        }
        if (isset($map['outside_success_callback_url'])) {
            $model->outsideSuccessCallbackUrl = $map['outside_success_callback_url'];
        }

        return $model;
    }
}
