<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class OfflineClusterContainerRequest extends Model
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

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // pod名字
    /**
     * @var string
     */
    public $podName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'envId'             => 'env_id',
        'prodCode'          => 'prod_code',
        'appName'           => 'app_name',
        'podName'           => 'pod_name',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('podName', $this->podName, true);
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
        if (null !== $this->podName) {
            $res['pod_name'] = $this->podName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OfflineClusterContainerRequest
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
        if (isset($map['pod_name'])) {
            $model->podName = $map['pod_name'];
        }

        return $model;
    }
}
