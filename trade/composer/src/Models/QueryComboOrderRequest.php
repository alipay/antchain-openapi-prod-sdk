<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class QueryComboOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户ID，租户ID和租户名称二选一必填
    /**
     * @var string
     */
    public $tenantId;

    // 租户名称，租户ID和租户名称二选一必填
    /**
     * @var string
     */
    public $tenantName;

    // 订单状态
    /**
     * @var string
     */
    public $status;

    // 套餐编码
    /**
     * @var string
     */
    public $comboCode;

    // 下单开始时间
    /**
     * @var string
     */
    public $beginTime;

    // 下单结束时间
    /**
     * @var string
     */
    public $endTime;

    // 每页数量，不传默认20
    /**
     * @var int
     */
    public $pageSize;

    // 当前页数，不传则默认1
    /**
     * @var int
     */
    public $pageNo;
    protected $_name = [
        'authToken'  => 'auth_token',
        'tenantId'   => 'tenant_id',
        'tenantName' => 'tenant_name',
        'status'     => 'status',
        'comboCode'  => 'combo_code',
        'beginTime'  => 'begin_time',
        'endTime'    => 'end_time',
        'pageSize'   => 'page_size',
        'pageNo'     => 'page_no',
    ];

    public function validate()
    {
        Model::validatePattern('beginTime', $this->beginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->comboCode) {
            $res['combo_code'] = $this->comboCode;
        }
        if (null !== $this->beginTime) {
            $res['begin_time'] = $this->beginTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryComboOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['combo_code'])) {
            $model->comboCode = $map['combo_code'];
        }
        if (isset($map['begin_time'])) {
            $model->beginTime = $map['begin_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }

        return $model;
    }
}
