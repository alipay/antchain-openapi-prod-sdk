<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class QueryComboRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 类目编码
    /**
     * @var string
     */
    public $categoryCode;
    protected $_name = [
        'authToken'    => 'auth_token',
        'categoryCode' => 'category_code',
    ];

    public function validate()
    {
        Model::validateRequired('categoryCode', $this->categoryCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryComboRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }

        return $model;
    }
}
