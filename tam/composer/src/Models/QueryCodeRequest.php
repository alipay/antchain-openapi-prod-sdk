<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class QueryCodeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string[]
     */
    public $l5codeList;
    protected $_name = [
        'authToken'  => 'auth_token',
        'l5codeList' => 'l5code_list',
    ];

    public function validate()
    {
        Model::validateRequired('l5codeList', $this->l5codeList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->l5codeList) {
            $res['l5code_list'] = $this->l5codeList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCodeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['l5code_list'])) {
            if (!empty($map['l5code_list'])) {
                $model->l5codeList = $map['l5code_list'];
            }
        }

        return $model;
    }
}
