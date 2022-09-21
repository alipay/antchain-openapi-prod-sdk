<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e24d1923d9dc43cc8cb90aeb2f35cc20\Models;

use AlibabaCloud\Tea\Model;

class QueryDemoTestTestRequest extends Model
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

    /**
     * @var string
     */
    public $acpmpcore;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'acpmpcore'         => 'acpmpcore',
    ];

    public function validate()
    {
        Model::validateRequired('acpmpcore', $this->acpmpcore, true);
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
        if (null !== $this->acpmpcore) {
            $res['acpmpcore'] = $this->acpmpcore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDemoTestTestRequest
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
        if (isset($map['acpmpcore'])) {
            $model->acpmpcore = $map['acpmpcore'];
        }

        return $model;
    }
}
