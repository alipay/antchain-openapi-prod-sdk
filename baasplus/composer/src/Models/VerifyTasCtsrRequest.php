<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class VerifyTasCtsrRequest extends Model
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

    // 请求时间凭证接口返回的ctsr参数
    /**
     * @var string
     */
    public $ctsr;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'ctsr'              => 'ctsr',
    ];

    public function validate()
    {
        Model::validateRequired('ctsr', $this->ctsr, true);
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
        if (null !== $this->ctsr) {
            $res['ctsr'] = $this->ctsr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyTasCtsrRequest
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
        if (isset($map['ctsr'])) {
            $model->ctsr = $map['ctsr'];
        }

        return $model;
    }
}
