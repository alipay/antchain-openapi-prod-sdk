<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsNotifyhistoryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // from
    /**
     * @var int
     */
    public $from;

    // login_name
    /**
     * @var string
     */
    public $loginName;

    // to
    /**
     * @var int
     */
    public $to;
    protected $_name = [
        'authToken' => 'auth_token',
        'from'      => 'from',
        'loginName' => 'login_name',
        'to'        => 'to',
    ];

    public function validate()
    {
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('to', $this->to, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRmsNotifyhistoryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }

        return $model;
    }
}
