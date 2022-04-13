<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryUnireleaseSolutionfilesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 日期
    /**
     * @var string
     */
    public $date;
    protected $_name = [
        'authToken' => 'auth_token',
        'date'      => 'date',
    ];

    public function validate()
    {
        Model::validateRequired('date', $this->date, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnireleaseSolutionfilesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }

        return $model;
    }
}
