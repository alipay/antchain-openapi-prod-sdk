<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bcd56548adce45febea214a77c845293\Models;

use AlibabaCloud\Tea\Model;

class GetAntcloudCatAgeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 猫猫的id
    /**
     * @var string
     */
    public $id;

    // a a a
    /**
     * @var string
     */
    public $time;
    protected $_name = [
        'authToken' => 'auth_token',
        'id'        => 'id',
        'time'      => 'time',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('time', $this->time, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAntcloudCatAgeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }

        return $model;
    }
}
