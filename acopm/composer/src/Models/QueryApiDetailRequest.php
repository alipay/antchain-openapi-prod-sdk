<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class QueryApiDetailRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // demo
    /**
     * @var string
     */
    public $targetProd;

    // demo
    /**
     * @var string
     */
    public $targetApi;
    protected $_name = [
        'authToken'  => 'auth_token',
        'targetProd' => 'target_prod',
        'targetApi'  => 'target_api',
    ];

    public function validate()
    {
        Model::validateRequired('targetProd', $this->targetProd, true);
        Model::validateRequired('targetApi', $this->targetApi, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->targetProd) {
            $res['target_prod'] = $this->targetProd;
        }
        if (null !== $this->targetApi) {
            $res['target_api'] = $this->targetApi;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiDetailRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['target_prod'])) {
            $model->targetProd = $map['target_prod'];
        }
        if (isset($map['target_api'])) {
            $model->targetApi = $map['target_api'];
        }

        return $model;
    }
}
