<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class QueryProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // l3code的数组
    /**
     * @var string[]
     */
    public $l3codeList;
    protected $_name = [
        'authToken'  => 'auth_token',
        'l3codeList' => 'l3code_list',
    ];

    public function validate()
    {
        Model::validateRequired('l3codeList', $this->l3codeList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->l3codeList) {
            $res['l3code_list'] = $this->l3codeList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['l3code_list'])) {
            if (!empty($map['l3code_list'])) {
                $model->l3codeList = $map['l3code_list'];
            }
        }

        return $model;
    }
}
