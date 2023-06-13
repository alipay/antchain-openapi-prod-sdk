<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class XrUserTicketInfo extends Model
{
    // xr通行证资源池名称
    /**
     * @example 资源池001
     *
     * @var string
     */
    public $xrTicketPoolName;

    // 购买数量
    /**
     * @example 10
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'xrTicketPoolName' => 'xr_ticket_pool_name',
        'count'            => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('xrTicketPoolName', $this->xrTicketPoolName, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->xrTicketPoolName) {
            $res['xr_ticket_pool_name'] = $this->xrTicketPoolName;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XrUserTicketInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['xr_ticket_pool_name'])) {
            $model->xrTicketPoolName = $map['xr_ticket_pool_name'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
