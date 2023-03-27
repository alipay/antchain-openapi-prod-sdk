<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SMARTACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class SystemParam extends Model
{
    // 合作伙伴
    /**
     * @example DINGDING
     *
     * @var string
     */
    public $partner;

    // 业务场景单元
    /**
     * @example DINGDING.PAYMENT.QUERY
     *
     * @var string
     */
    public $function;

    // 业务幂等号
    /**
     * @example xxxxxxx
     *
     * @var string
     */
    public $requestId;
    protected $_name = [
        'partner'   => 'partner',
        'function'  => 'function',
        'requestId' => 'request_id',
    ];

    public function validate()
    {
        Model::validateRequired('partner', $this->partner, true);
        Model::validateRequired('function', $this->function, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->partner) {
            $res['partner'] = $this->partner;
        }
        if (null !== $this->function) {
            $res['function'] = $this->function;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SystemParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['partner'])) {
            $model->partner = $map['partner'];
        }
        if (isset($map['function'])) {
            $model->function = $map['function'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
