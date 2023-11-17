<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class AuthAntchainPdcpProjectDatasetRequest extends Model
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

    // 数据集名称
    /**
     * @var string
     */
    public $name;

    // 数据集配置参数，若授权的数据集归属于云上的节点，则参考结构体AuthSaasDatasetConfig，若授权的数据集归属于线下的节点，则参考结构体AuthFateDatasetConfig
    /**
     * @var string
     */
    public $config;

    // 项目ID
    /**
     * @var string
     */
    public $projectId;

    // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
    /**
     * @var string
     */
    public $visibleType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'config'            => 'config',
        'projectId'         => 'project_id',
        'visibleType'       => 'visible_type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('config', $this->config, true);
        Model::validateRequired('projectId', $this->projectId, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->visibleType) {
            $res['visible_type'] = $this->visibleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthAntchainPdcpProjectDatasetRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['visible_type'])) {
            $model->visibleType = $map['visible_type'];
        }

        return $model;
    }
}
