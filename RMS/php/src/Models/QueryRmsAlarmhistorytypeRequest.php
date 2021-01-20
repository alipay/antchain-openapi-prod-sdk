<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsAlarmhistorytypeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'from' => 'from',
        'to' => 'to',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
     * @return QueryRmsAlarmhistorytypeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['from'])){
            $model->from = $map['from'];
        }
        if(isset($map['to'])){
            $model->to = $map['to'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

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

}
