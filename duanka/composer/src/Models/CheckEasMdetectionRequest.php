<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class CheckEasMdetectionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // sql
    /**
     * @var string
     */
    public $sql;
    protected $_name = [
        'authToken' => 'auth_token',
        'sql'       => 'sql',
    ];

    public function validate()
    {
        Model::validateRequired('sql', $this->sql, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sql) {
            $res['sql'] = $this->sql;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckEasMdetectionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['sql'])) {
            $model->sql = $map['sql'];
        }

        return $model;
    }
}
