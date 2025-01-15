<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class BusinessRequest extends Model
{
    // 客户名称
    /**
     * @example XXX公司
     *
     * @var string
     */
    public $customerName;

    // 客户id
    /**
     * @example XXX
     *
     * @var string
     */
    public $customerId;

    // 商机名称
    /**
     * @example XXX
     *
     * @var string
     */
    public $businessName;

    // 商机ID
    /**
     * @example xxx
     *
     * @var string
     */
    public $businessId;

    // 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
    /**
     * @example INIT
     *
     * @var string
     */
    public $businessStatus;

    // 商机说明
    /**
     * @example XXX
     *
     * @var string
     */
    public $businessExplain;

    // 线索来源
    /**
     * @example
     *
     * @var string
     */
    public $source;

    // 商机时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $businessDate;

    // 租户
    /**
     * @example BCC
     *
     * @var string
     */
    public $tenant;

    // 创建人工号
    /**
     * @example 132
     *
     * @var string
     */
    public $creator;

    // 创建人花名
    /**
     * @example XX
     *
     * @var string
     */
    public $creatorNick;
    protected $_name = [
        'customerName'    => 'customer_name',
        'customerId'      => 'customer_id',
        'businessName'    => 'business_name',
        'businessId'      => 'business_id',
        'businessStatus'  => 'business_status',
        'businessExplain' => 'business_explain',
        'source'          => 'source',
        'businessDate'    => 'business_date',
        'tenant'          => 'tenant',
        'creator'         => 'creator',
        'creatorNick'     => 'creator_nick',
    ];

    public function validate()
    {
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validateRequired('businessName', $this->businessName, true);
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('businessStatus', $this->businessStatus, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('businessDate', $this->businessDate, true);
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('creatorNick', $this->creatorNick, true);
        Model::validatePattern('businessDate', $this->businessDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->businessName) {
            $res['business_name'] = $this->businessName;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->businessStatus) {
            $res['business_status'] = $this->businessStatus;
        }
        if (null !== $this->businessExplain) {
            $res['business_explain'] = $this->businessExplain;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->businessDate) {
            $res['business_date'] = $this->businessDate;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->creatorNick) {
            $res['creator_nick'] = $this->creatorNick;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BusinessRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['business_name'])) {
            $model->businessName = $map['business_name'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['business_status'])) {
            $model->businessStatus = $map['business_status'];
        }
        if (isset($map['business_explain'])) {
            $model->businessExplain = $map['business_explain'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['business_date'])) {
            $model->businessDate = $map['business_date'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['creator_nick'])) {
            $model->creatorNick = $map['creator_nick'];
        }

        return $model;
    }
}
