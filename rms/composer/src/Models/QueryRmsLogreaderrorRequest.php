<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsLogreaderrorRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app
    /**
     * @var string
     */
    public $app;

    // time
    /**
     * @var int
     */
    public $time;
    protected $_name = [
        'authToken' => 'auth_token',
        'app'       => 'app',
        'time'      => 'time',
    ];

    public function validate()
    {
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('time', $this->time, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRmsLogreaderrorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }

        return $model;
    }
}
