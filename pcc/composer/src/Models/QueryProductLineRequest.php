<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class QueryProductLineRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 是否查询l3级产品
    /**
     * @var bool
     */
    public $needProduct;

    // 是否查询l5
    /**
     * @var bool
     */
    public $needSku;
    protected $_name = [
        'authToken'   => 'auth_token',
        'needProduct' => 'need_product',
        'needSku'     => 'need_sku',
    ];

    public function validate()
    {
        Model::validateRequired('needProduct', $this->needProduct, true);
        Model::validateRequired('needSku', $this->needSku, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->needProduct) {
            $res['need_product'] = $this->needProduct;
        }
        if (null !== $this->needSku) {
            $res['need_sku'] = $this->needSku;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProductLineRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['need_product'])) {
            $model->needProduct = $map['need_product'];
        }
        if (isset($map['need_sku'])) {
            $model->needSku = $map['need_sku'];
        }

        return $model;
    }
}
