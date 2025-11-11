<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetDataAuthConfigResponse extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 数据源连接器空间id
    /**
     * @var string
     */
    public $sourceSpaceId;

    // 被授权方企业信用代码
    /**
     * @var string
     */
    public $enterpriseCode;

    // 接入方客户名称
    /**
     * @var string
     */
    public $targetName;

    // 被授权应用名称
    /**
     * @var string
     */
    public $authAppName;

    // 客户应用logo
    /**
     * @var string
     */
    public $enterpriseLogo;

    // 客户应用logo访问链接
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

    // 授权形式
    /**
     * @var string
     */
    public $authType;

    // 用户表示类型
    /**
     * @var string
     */
    public $userType;

    // 使用刷脸识别
    /**
     * @var bool
     */
    public $useFacialRecognition;

    // 授权服务产品列表
    /**
     * @var AuthProduct[]
     */
    public $authProductList;

    // 协议模板列表
    /**
     * @var Agreement[]
     */
    public $agreementList;

    // 背景颜色
    /**
     * @var string
     */
    public $backgroundColor;

    // 授权页面使用范围
    /**
     * @var string[]
     */
    public $useScopeList;

    // 场景授权状态
    /**
     * @var bool
     */
    public $authStatus;

    // c端发起授权页面的url链接
    /**
     * @var string
     */
    public $startAuthUrl;

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

    // 授权成功端内跳回页的url链接
    /**
     * @var string
     */
    public $innerSuccessCallbackUrl;

    // 授权成功端外跳回页的url链接
    /**
     * @var string
     */
    public $outsideSuccessCallbackUrl;

    // 待授权数量
    /**
     * @var int
     */
    public $pendingAuthCount;

    // 已授权数量
    /**
     * @var int
     */
    public $haveAuthedCount;

    // 已取消授权数量
    /**
     * @var int
     */
    public $cancelAuthCount;

    // 授权成功率
    /**
     * @var string
     */
    public $successRate;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'sceneCode'                 => 'scene_code',
        'sourceSpaceId'             => 'source_space_id',
        'enterpriseCode'            => 'enterprise_code',
        'targetName'                => 'target_name',
        'authAppName'               => 'auth_app_name',
        'enterpriseLogo'            => 'enterprise_logo',
        'enterpriseLogoUrl'         => 'enterprise_logo_url',
        'authPurpose'               => 'auth_purpose',
        'authDesc'                  => 'auth_desc',
        'authType'                  => 'auth_type',
        'userType'                  => 'user_type',
        'useFacialRecognition'      => 'use_facial_recognition',
        'authProductList'           => 'auth_product_list',
        'agreementList'             => 'agreement_list',
        'backgroundColor'           => 'background_color',
        'useScopeList'              => 'use_scope_list',
        'authStatus'                => 'auth_status',
        'startAuthUrl'              => 'start_auth_url',
        'enableShowProofVc'         => 'enable_show_proof_vc',
        'enableShowAuthRecord'      => 'enable_show_auth_record',
        'innerSuccessCallbackUrl'   => 'inner_success_callback_url',
        'outsideSuccessCallbackUrl' => 'outside_success_callback_url',
        'pendingAuthCount'          => 'pending_auth_count',
        'haveAuthedCount'           => 'have_authed_count',
        'cancelAuthCount'           => 'cancel_auth_count',
        'successRate'               => 'success_rate',
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
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->sourceSpaceId) {
            $res['source_space_id'] = $this->sourceSpaceId;
        }
        if (null !== $this->enterpriseCode) {
            $res['enterprise_code'] = $this->enterpriseCode;
        }
        if (null !== $this->targetName) {
            $res['target_name'] = $this->targetName;
        }
        if (null !== $this->authAppName) {
            $res['auth_app_name'] = $this->authAppName;
        }
        if (null !== $this->enterpriseLogo) {
            $res['enterprise_logo'] = $this->enterpriseLogo;
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
        if (null !== $this->useFacialRecognition) {
            $res['use_facial_recognition'] = $this->useFacialRecognition;
        }
        if (null !== $this->authProductList) {
            $res['auth_product_list'] = [];
            if (null !== $this->authProductList && \is_array($this->authProductList)) {
                $n = 0;
                foreach ($this->authProductList as $item) {
                    $res['auth_product_list'][$n++] = null !== $item ? $item->toMap() : $item;
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
        if (null !== $this->backgroundColor) {
            $res['background_color'] = $this->backgroundColor;
        }
        if (null !== $this->useScopeList) {
            $res['use_scope_list'] = $this->useScopeList;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->startAuthUrl) {
            $res['start_auth_url'] = $this->startAuthUrl;
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
        if (null !== $this->pendingAuthCount) {
            $res['pending_auth_count'] = $this->pendingAuthCount;
        }
        if (null !== $this->haveAuthedCount) {
            $res['have_authed_count'] = $this->haveAuthedCount;
        }
        if (null !== $this->cancelAuthCount) {
            $res['cancel_auth_count'] = $this->cancelAuthCount;
        }
        if (null !== $this->successRate) {
            $res['success_rate'] = $this->successRate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDataAuthConfigResponse
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
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['source_space_id'])) {
            $model->sourceSpaceId = $map['source_space_id'];
        }
        if (isset($map['enterprise_code'])) {
            $model->enterpriseCode = $map['enterprise_code'];
        }
        if (isset($map['target_name'])) {
            $model->targetName = $map['target_name'];
        }
        if (isset($map['auth_app_name'])) {
            $model->authAppName = $map['auth_app_name'];
        }
        if (isset($map['enterprise_logo'])) {
            $model->enterpriseLogo = $map['enterprise_logo'];
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
        if (isset($map['use_facial_recognition'])) {
            $model->useFacialRecognition = $map['use_facial_recognition'];
        }
        if (isset($map['auth_product_list'])) {
            if (!empty($map['auth_product_list'])) {
                $model->authProductList = [];
                $n                      = 0;
                foreach ($map['auth_product_list'] as $item) {
                    $model->authProductList[$n++] = null !== $item ? AuthProduct::fromMap($item) : $item;
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
        if (isset($map['background_color'])) {
            $model->backgroundColor = $map['background_color'];
        }
        if (isset($map['use_scope_list'])) {
            if (!empty($map['use_scope_list'])) {
                $model->useScopeList = $map['use_scope_list'];
            }
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['start_auth_url'])) {
            $model->startAuthUrl = $map['start_auth_url'];
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
        if (isset($map['pending_auth_count'])) {
            $model->pendingAuthCount = $map['pending_auth_count'];
        }
        if (isset($map['have_authed_count'])) {
            $model->haveAuthedCount = $map['have_authed_count'];
        }
        if (isset($map['cancel_auth_count'])) {
            $model->cancelAuthCount = $map['cancel_auth_count'];
        }
        if (isset($map['success_rate'])) {
            $model->successRate = $map['success_rate'];
        }

        return $model;
    }
}
