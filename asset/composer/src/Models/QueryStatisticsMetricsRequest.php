<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class QueryStatisticsMetricsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 请求唯一id
    /**
     * @var string
     */
    public $requestUniqueId;

    // 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
    /**
     * @var string
     */
    public $type;

    // 查询开始时间: DAY:20240911; MONTH:202409
    /**
     * @var string
     */
    public $startDate;

    // 查询结束日期
    /**
     * @var string
     */
    public $endDate;

    // 日期单位: DAY,MONTH
    /**
     * @var string
     */
    public $dateUnit;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'requestUniqueId'   => 'request_unique_id',
        'type'              => 'type',
        'startDate'         => 'start_date',
        'endDate'           => 'end_date',
        'dateUnit'          => 'date_unit',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('requestUniqueId', $this->requestUniqueId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validateRequired('dateUnit', $this->dateUnit, true);
        Model::validateMaxLength('requestUniqueId', $this->requestUniqueId, 36);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->requestUniqueId) {
            $res['request_unique_id'] = $this->requestUniqueId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->dateUnit) {
            $res['date_unit'] = $this->dateUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStatisticsMetricsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['request_unique_id'])) {
            $model->requestUniqueId = $map['request_unique_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['date_unit'])) {
            $model->dateUnit = $map['date_unit'];
        }

        return $model;
    }
}
