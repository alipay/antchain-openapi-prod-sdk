<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class PagequeryResourceinstancesLbsRequest extends Model
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

    // 环境id
    /**
     * @var string
     */
    public $envId;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 部署单元标识id
    /**
     * @var string
     */
    public $deploymentUnitIdentity;

    // 部署单元实例id
    /**
     * @var string
     */
    public $deploymentUnitInstanceIdentity;
    protected $_name = [
        'authToken'                      => 'auth_token',
        'productInstanceId'              => 'product_instance_id',
        'envId'                          => 'env_id',
        'prodCode'                       => 'prod_code',
        'appName'                        => 'app_name',
        'deploymentUnitIdentity'         => 'deployment_unit_identity',
        'deploymentUnitInstanceIdentity' => 'deployment_unit_instance_identity',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('appName', $this->appName, true);
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
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->deploymentUnitIdentity) {
            $res['deployment_unit_identity'] = $this->deploymentUnitIdentity;
        }
        if (null !== $this->deploymentUnitInstanceIdentity) {
            $res['deployment_unit_instance_identity'] = $this->deploymentUnitInstanceIdentity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryResourceinstancesLbsRequest
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
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['deployment_unit_identity'])) {
            $model->deploymentUnitIdentity = $map['deployment_unit_identity'];
        }
        if (isset($map['deployment_unit_instance_identity'])) {
            $model->deploymentUnitInstanceIdentity = $map['deployment_unit_instance_identity'];
        }

        return $model;
    }
}
