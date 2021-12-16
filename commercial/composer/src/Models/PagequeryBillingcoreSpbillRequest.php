<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PagequeryBillingcoreSpbillRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 当前页码
    /**
     * @var int
     */
    public $current;

    // 每页记录数
    /**
     * @var int
     */
    public $pageSize;

    // 开始时间
    /**
     * @var string
     */
    public $startDate;

    // 结束时间
    /**
     * @var string
     */
    public $endDate;

    // 账单状态
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken' => 'auth_token',
        'current'   => 'current',
        'pageSize'  => 'page_size',
        'startDate' => 'start_date',
        'endDate'   => 'end_date',
        'status'    => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validatePattern('startDate', $this->startDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endDate', $this->endDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryBillingcoreSpbillRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
