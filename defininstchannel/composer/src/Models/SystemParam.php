<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEFININSTCHANNEL\Models;

use AlibabaCloud\Tea\Model;

class SystemParam extends Model
{
    // 合作方标识，由蚂蚁分配
    /**
     * @example ZHONGCHUAN
     *
     * @var string
     */
    public $partner;

    // 功能标识，业务接口定义
    /**
     * @example INSTAPI.EXECUTE
     *
     * @var string
     */
    public $function;

    // 请求流水号
    /**
     * @example 2023010200009092002320878471
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
        Model::validateRequired('requestId', $this->requestId, true);
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
