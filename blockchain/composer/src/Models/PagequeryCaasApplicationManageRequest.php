<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PagequeryCaasApplicationManageRequest extends Model
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

    // 页码
    /**
     * @var int
     */
    public $num;

    // 页大小
    /**
     * @var int
     */
    public $size;

    // 链ID
    /**
     * @var string
     */
    public $chainId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'num'               => 'num',
        'size'              => 'size',
        'chainId'           => 'chain_id',
    ];

    public function validate()
    {
        Model::validateRequired('num', $this->num, true);
        Model::validateRequired('size', $this->size, true);
        Model::validateRequired('chainId', $this->chainId, true);
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
        if (null !== $this->num) {
            $res['num'] = $this->num;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryCaasApplicationManageRequest
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
        if (isset($map['num'])) {
            $model->num = $map['num'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }

        return $model;
    }
}
