<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class XrUserTicketResultInfo extends Model
{
    // xr通行证资源池名称
    /**
     * @example 资源池001
     *
     * @var string
     */
    public $xrTicketPoolName;

    // 购买数量，失败列表有值
    /**
     * @example 10
     *
     * @var int
     */
    public $count;

    // 失败原因，失败列表有值
    /**
     * @example 参数错误
     *
     * @var string
     */
    public $errorMsg;

    // 通行证编号，成功列表有值
    /**
     * @example 123123
     *
     * @var string
     */
    public $xrTicketCode;
    protected $_name = [
        'xrTicketPoolName' => 'xr_ticket_pool_name',
        'count'            => 'count',
        'errorMsg'         => 'error_msg',
        'xrTicketCode'     => 'xr_ticket_code',
    ];

    public function validate()
    {
        Model::validateRequired('xrTicketPoolName', $this->xrTicketPoolName, true);
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
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->xrTicketCode) {
            $res['xr_ticket_code'] = $this->xrTicketCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XrUserTicketResultInfo
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
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['xr_ticket_code'])) {
            $model->xrTicketCode = $map['xr_ticket_code'];
        }

        return $model;
    }
}
