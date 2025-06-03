<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABC\Models;

use AlibabaCloud\Tea\Model;

class CreateapiExistingProductsRequest extends Model
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

    // 计算值输入
    /**
     * @var int
     */
    public $execNum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'execNum'           => 'exec_num',
    ];

    public function validate()
    {
        Model::validateRequired('execNum', $this->execNum, true);
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
        if (null !== $this->execNum) {
            $res['exec_num'] = $this->execNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateapiExistingProductsRequest
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
        if (isset($map['exec_num'])) {
            $model->execNum = $map['exec_num'];
        }

        return $model;
    }
}
