<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class QueryGdStoreRequest extends Model
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

    // 查询店铺基本信息请求体
    /**
     * @var GdCustomerFlow
     */
    public $gdCustomerFlow;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'gdCustomerFlow'    => 'gd_customer_flow',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('gdCustomerFlow', $this->gdCustomerFlow, true);
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
        if (null !== $this->gdCustomerFlow) {
            $res['gd_customer_flow'] = null !== $this->gdCustomerFlow ? $this->gdCustomerFlow->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGdStoreRequest
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
        if (isset($map['gd_customer_flow'])) {
            $model->gdCustomerFlow = GdCustomerFlow::fromMap($map['gd_customer_flow']);
        }

        return $model;
    }
}
