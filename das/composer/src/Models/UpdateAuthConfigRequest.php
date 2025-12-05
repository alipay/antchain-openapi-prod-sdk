<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateAuthConfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 复用的场景码
    /**
     * @var string
     */
    public $parentSceneCode;

    // 数据源连接器空间id
    /**
     * @var string
     */
    public $sourceSpaceId;

    // 被授权方企业信用代码
    /**
     * @var string
     */
    public $authEnterpriseCode;

    // 被授权方名称
    /**
     * @var string
     */
    public $targetName;

    // 业务应用名称
    /**
     * @var string
     */
    public $authAppName;

    // 客户应用logo的oss key
    /**
     * @var string
     */
    public $enterpriseLogo;

    // 用途说明
    /**
     * @var string
     */
    public $authPurpose;

    // 授权描述
    /**
     * @var string
     */
    public $authDesc;

    // 授权形式
    /**
     * @var string
     */
    public $authType;

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

    // 授权服务产品列表
    /**
     * @var AuthProductGroup[]
     */
    public $productGroupList;

    // 用户类型
    /**
     * @var string
     */
    public $userType;

    // 授权协议
    /**
     * @var Agreement[]
     */
    public $agreementList;

    // 主题颜色
    /**
     * @var string
     */
    public $backgroundColor;

    // 使用刷脸识别
    /**
     * @var bool
     */
    public $useFacialRecognition;

    // 页面使用范围列表
    /**
     * @var string[]
     */
    public $useScopeList;

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

    // 公钥
    /**
     * @var string
     */
    public $publicKey;

    // 发起授权页面的链接
    /**
     * @var string
     */
    public $startAuthUrl;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'sceneCode'                 => 'scene_code',
        'parentSceneCode'           => 'parent_scene_code',
        'sourceSpaceId'             => 'source_space_id',
        'authEnterpriseCode'        => 'auth_enterprise_code',
        'targetName'                => 'target_name',
        'authAppName'               => 'auth_app_name',
        'enterpriseLogo'            => 'enterprise_logo',
        'authPurpose'               => 'auth_purpose',
        'authDesc'                  => 'auth_desc',
        'authType'                  => 'auth_type',
        'enableShowProofVc'         => 'enable_show_proof_vc',
        'enableShowAuthRecord'      => 'enable_show_auth_record',
        'productGroupList'          => 'product_group_list',
        'userType'                  => 'user_type',
        'agreementList'             => 'agreement_list',
        'backgroundColor'           => 'background_color',
        'useFacialRecognition'      => 'use_facial_recognition',
        'useScopeList'              => 'use_scope_list',
        'innerSuccessCallbackUrl'   => 'inner_success_callback_url',
        'outsideSuccessCallbackUrl' => 'outside_success_callback_url',
        'publicKey'                 => 'public_key',
        'startAuthUrl'              => 'start_auth_url',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('sourceSpaceId', $this->sourceSpaceId, true);
        Model::validateRequired('authEnterpriseCode', $this->authEnterpriseCode, true);
        Model::validateRequired('targetName', $this->targetName, true);
        Model::validateRequired('authAppName', $this->authAppName, true);
        Model::validateRequired('enterpriseLogo', $this->enterpriseLogo, true);
        Model::validateRequired('authPurpose', $this->authPurpose, true);
        Model::validateRequired('authType', $this->authType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->parentSceneCode) {
            $res['parent_scene_code'] = $this->parentSceneCode;
        }
        if (null !== $this->sourceSpaceId) {
            $res['source_space_id'] = $this->sourceSpaceId;
        }
        if (null !== $this->authEnterpriseCode) {
            $res['auth_enterprise_code'] = $this->authEnterpriseCode;
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
        if (null !== $this->authPurpose) {
            $res['auth_purpose'] = $this->authPurpose;
        }
        if (null !== $this->authDesc) {
            $res['auth_desc'] = $this->authDesc;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->enableShowProofVc) {
            $res['enable_show_proof_vc'] = $this->enableShowProofVc;
        }
        if (null !== $this->enableShowAuthRecord) {
            $res['enable_show_auth_record'] = $this->enableShowAuthRecord;
        }
        if (null !== $this->productGroupList) {
            $res['product_group_list'] = [];
            if (null !== $this->productGroupList && \is_array($this->productGroupList)) {
                $n = 0;
                foreach ($this->productGroupList as $item) {
                    $res['product_group_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
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
        if (null !== $this->useFacialRecognition) {
            $res['use_facial_recognition'] = $this->useFacialRecognition;
        }
        if (null !== $this->useScopeList) {
            $res['use_scope_list'] = $this->useScopeList;
        }
        if (null !== $this->innerSuccessCallbackUrl) {
            $res['inner_success_callback_url'] = $this->innerSuccessCallbackUrl;
        }
        if (null !== $this->outsideSuccessCallbackUrl) {
            $res['outside_success_callback_url'] = $this->outsideSuccessCallbackUrl;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->startAuthUrl) {
            $res['start_auth_url'] = $this->startAuthUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAuthConfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['parent_scene_code'])) {
            $model->parentSceneCode = $map['parent_scene_code'];
        }
        if (isset($map['source_space_id'])) {
            $model->sourceSpaceId = $map['source_space_id'];
        }
        if (isset($map['auth_enterprise_code'])) {
            $model->authEnterpriseCode = $map['auth_enterprise_code'];
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
        if (isset($map['auth_purpose'])) {
            $model->authPurpose = $map['auth_purpose'];
        }
        if (isset($map['auth_desc'])) {
            $model->authDesc = $map['auth_desc'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['enable_show_proof_vc'])) {
            $model->enableShowProofVc = $map['enable_show_proof_vc'];
        }
        if (isset($map['enable_show_auth_record'])) {
            $model->enableShowAuthRecord = $map['enable_show_auth_record'];
        }
        if (isset($map['product_group_list'])) {
            if (!empty($map['product_group_list'])) {
                $model->productGroupList = [];
                $n                       = 0;
                foreach ($map['product_group_list'] as $item) {
                    $model->productGroupList[$n++] = null !== $item ? AuthProductGroup::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
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
        if (isset($map['use_facial_recognition'])) {
            $model->useFacialRecognition = $map['use_facial_recognition'];
        }
        if (isset($map['use_scope_list'])) {
            if (!empty($map['use_scope_list'])) {
                $model->useScopeList = $map['use_scope_list'];
            }
        }
        if (isset($map['inner_success_callback_url'])) {
            $model->innerSuccessCallbackUrl = $map['inner_success_callback_url'];
        }
        if (isset($map['outside_success_callback_url'])) {
            $model->outsideSuccessCallbackUrl = $map['outside_success_callback_url'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['start_auth_url'])) {
            $model->startAuthUrl = $map['start_auth_url'];
        }

        return $model;
    }
}
