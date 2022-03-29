<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsAlarmhistoryappstatsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_list
    /**
     * @var AppStats
     */
    public $appList;

    // from
    /**
     * @var int
     */
    public $from;

    // to
    /**
     * @var int
     */
    public $to;
    protected $_name = [
        'authToken' => 'auth_token',
        'appList'   => 'app_list',
        'from'      => 'from',
        'to'        => 'to',
    ];

    public function validate()
    {
        Model::validateRequired('appList', $this->appList, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appList) {
            $res['app_list'] = null !== $this->appList ? $this->appList->toMap() : null;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRmsAlarmhistoryappstatsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_list'])) {
            $model->appList = AppStats::fromMap($map['app_list']);
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }

        return $model;
    }
}
