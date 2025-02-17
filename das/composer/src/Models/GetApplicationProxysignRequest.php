<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class GetApplicationProxysignRequest extends Model
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

    // 代签名相关参数
    /**
     * @var string
     */
    public $signParams;

    // 对应的服务id
    /**
     * @var string
     */
    public $dataSetId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'signParams'        => 'sign_params',
        'dataSetId'         => 'data_set_id',
    ];

    public function validate()
    {
        Model::validateRequired('signParams', $this->signParams, true);
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
        if (null !== $this->signParams) {
            $res['sign_params'] = $this->signParams;
        }
        if (null !== $this->dataSetId) {
            $res['data_set_id'] = $this->dataSetId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetApplicationProxysignRequest
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
        if (isset($map['sign_params'])) {
            $model->signParams = $map['sign_params'];
        }
        if (isset($map['data_set_id'])) {
            $model->dataSetId = $map['data_set_id'];
        }

        return $model;
    }
}
