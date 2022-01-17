<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class LimitConfigVO extends Model
{
    // 是否需要限制
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needLimit;

    // 限制阈值
    /**
     * @example
     *
     * @var int
     */
    public $limit;

    // 限制响应类型
    /**
     * @example DEFAULT/MSG
     *
     * @var string
     */
    public $limitRspType;

    // 响应信息
    /**
     * @example rsp_msg1
     *
     * @var string
     */
    public $rspMsg;
    protected $_name = [
        'needLimit'    => 'need_limit',
        'limit'        => 'limit',
        'limitRspType' => 'limit_rsp_type',
        'rspMsg'       => 'rsp_msg',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->needLimit) {
            $res['need_limit'] = $this->needLimit;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        if (null !== $this->limitRspType) {
            $res['limit_rsp_type'] = $this->limitRspType;
        }
        if (null !== $this->rspMsg) {
            $res['rsp_msg'] = $this->rspMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LimitConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['need_limit'])) {
            $model->needLimit = $map['need_limit'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }
        if (isset($map['limit_rsp_type'])) {
            $model->limitRspType = $map['limit_rsp_type'];
        }
        if (isset($map['rsp_msg'])) {
            $model->rspMsg = $map['rsp_msg'];
        }

        return $model;
    }
}
