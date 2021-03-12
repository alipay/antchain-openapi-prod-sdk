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
    protected $_name = [
        'phone'         => 'phone',
        'gmtAuthorized' => 'gmt_authorized',
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

        return $model;
    }
}
