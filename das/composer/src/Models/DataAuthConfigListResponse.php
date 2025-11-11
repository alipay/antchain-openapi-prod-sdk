<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DataAuthConfigListResponse extends Model
{
    // 场景码
    /**
     * @example -
     *
     * @var string
     */
    public $sceneCode;

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

    // 数据产品服务简称列表
    /**
     * @example -
     *
     * @var string[]
     */
    public $productAbbrList;

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
    protected $_name = [
        'sceneCode'          => 'scene_code',
        'sourceSpaceId'      => 'source_space_id',
        'authEnterpriseCode' => 'auth_enterprise_code',
        'targetName'         => 'target_name',
        'authAppName'        => 'auth_app_name',
        'productAbbrList'    => 'product_abbr_list',
        'authCount'          => 'auth_count',
        'authStatus'         => 'auth_status',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('sourceSpaceId', $this->sourceSpaceId, true);
        Model::validateRequired('authEnterpriseCode', $this->authEnterpriseCode, true);
        Model::validateRequired('targetName', $this->targetName, true);
        Model::validateRequired('authAppName', $this->authAppName, true);
        Model::validateRequired('productAbbrList', $this->productAbbrList, true);
        Model::validateRequired('authCount', $this->authCount, true);
        Model::validateRequired('authStatus', $this->authStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
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
        if (null !== $this->productAbbrList) {
            $res['product_abbr_list'] = $this->productAbbrList;
        }
        if (null !== $this->authCount) {
            $res['auth_count'] = $this->authCount;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataAuthConfigListResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
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
        if (isset($map['product_abbr_list'])) {
            if (!empty($map['product_abbr_list'])) {
                $model->productAbbrList = $map['product_abbr_list'];
            }
        }
        if (isset($map['auth_count'])) {
            $model->authCount = $map['auth_count'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }

        return $model;
    }
}
