<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainMiniAppAuthorizedUser extends Model
{
    // phone
    /**
     * @example phone
     *
     * @var string
     */
    public $phone;

    // gmt_authorized
    /**
     * @example gmt_authorized
     *
     * @var string
     */
    public $gmtAuthorized;

    // 记录id
    /**
     * @example 112
     *
     * @var int
     */
    public $userId;
    protected $_name = [
        'phone'         => 'phone',
        'gmtAuthorized' => 'gmt_authorized',
        'userId'        => 'user_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->gmtAuthorized) {
            $res['gmt_authorized'] = $this->gmtAuthorized;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainMiniAppAuthorizedUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['gmt_authorized'])) {
            $model->gmtAuthorized = $map['gmt_authorized'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
