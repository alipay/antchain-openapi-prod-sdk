<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class ListCommercialcoreProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 类目id
    /**
     * @var int
     */
    public $catalogId;
    protected $_name = [
        'authToken' => 'auth_token',
        'catalogId' => 'catalog_id',
    ];

    public function validate()
    {
        Model::validateRequired('catalogId', $this->catalogId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->catalogId) {
            $res['catalog_id'] = $this->catalogId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListCommercialcoreProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['catalog_id'])) {
            $model->catalogId = $map['catalog_id'];
        }

        return $model;
    }
}
