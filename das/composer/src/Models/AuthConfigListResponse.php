<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class AuthConfigListResponse extends Model
{
    // 场景码
    /**
     * @example -
     *
     * @var string
     */
    public $sceneCode;

    // 授权类型
    /**
     * @example CREATE_AUTH_PAGE.新建数智空间授权页面  USE_EXIST_PAGE.使用数智空间已有授权页 RECEIVE_CUSTOMER_CALLBACK.接收客户回传授权信息
     *
     * @var string
     */
    public $authType;

    // 数据源连接器空间id
    /**
     * @example -
     *
     * @var string
     */
    public $sourceSpaceId;

    // 被授权方企业信用代码
    /**
     * @example -
     *
     * @var string
     */
    public $authEnterpriseCode;

    // 接入方企业名称
    /**
     * @example -
     *
     * @var string
     */
    public $targetName;

    // 被授权应用名称
    /**
     * @example -
     *
     * @var string
     */
    public $authAppName;

    // 授权内容列表
    /**
     * @example -
     *
     * @var AuthContent[]
     */
    public $authContentList;

    // 国标产品标识码列表
    /**
     * @example -
     *
     * @var string[]
     */
    public $productIdentityIdList;

    // 授权次数
    /**
     * @example -
     *
     * @var int
     */
    public $authCount;

    // 授权状态
    /**
     * @example true, false
     *
     * @var bool
     */
    public $authStatus;

    // 是否有协议
    /**
     * @example true, false
     *
     * @var bool
     */
    public $haveAgreement;
    protected $_name = [
        'sceneCode'             => 'scene_code',
        'authType'              => 'auth_type',
        'sourceSpaceId'         => 'source_space_id',
        'authEnterpriseCode'    => 'auth_enterprise_code',
        'targetName'            => 'target_name',
        'authAppName'           => 'auth_app_name',
        'authContentList'       => 'auth_content_list',
        'productIdentityIdList' => 'product_identity_id_list',
        'authCount'             => 'auth_count',
        'authStatus'            => 'auth_status',
        'haveAgreement'         => 'have_agreement',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('sourceSpaceId', $this->sourceSpaceId, true);
        Model::validateRequired('authEnterpriseCode', $this->authEnterpriseCode, true);
        Model::validateRequired('targetName', $this->targetName, true);
        Model::validateRequired('authAppName', $this->authAppName, true);
        Model::validateRequired('authContentList', $this->authContentList, true);
        Model::validateRequired('productIdentityIdList', $this->productIdentityIdList, true);
        Model::validateRequired('authCount', $this->authCount, true);
        Model::validateRequired('authStatus', $this->authStatus, true);
        Model::validateRequired('haveAgreement', $this->haveAgreement, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
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
        if (null !== $this->authContentList) {
            $res['auth_content_list'] = [];
            if (null !== $this->authContentList && \is_array($this->authContentList)) {
                $n = 0;
                foreach ($this->authContentList as $item) {
                    $res['auth_content_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->productIdentityIdList) {
            $res['product_identity_id_list'] = $this->productIdentityIdList;
        }
        if (null !== $this->authCount) {
            $res['auth_count'] = $this->authCount;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->haveAgreement) {
            $res['have_agreement'] = $this->haveAgreement;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthConfigListResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
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
        if (isset($map['auth_content_list'])) {
            if (!empty($map['auth_content_list'])) {
                $model->authContentList = [];
                $n                      = 0;
                foreach ($map['auth_content_list'] as $item) {
                    $model->authContentList[$n++] = null !== $item ? AuthContent::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['product_identity_id_list'])) {
            if (!empty($map['product_identity_id_list'])) {
                $model->productIdentityIdList = $map['product_identity_id_list'];
            }
        }
        if (isset($map['auth_count'])) {
            $model->authCount = $map['auth_count'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['have_agreement'])) {
            $model->haveAgreement = $map['have_agreement'];
        }

        return $model;
    }
}
