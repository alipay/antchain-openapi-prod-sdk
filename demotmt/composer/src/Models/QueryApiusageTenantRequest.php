<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOTMT\Models;

use AlibabaCloud\Tea\Model;

class QueryApiusageTenantRequest extends Model
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

    // 年
    /**
     * @var string
     */
    public $year;

    // 月份
    /**
     * @var string
     */
    public $month;

    // 租户id
    /**
     * @var string
     */
    public $clientId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'year'              => 'year',
        'month'             => 'month',
        'clientId'          => 'client_id',
    ];

    public function validate()
    {
        Model::validateRequired('year', $this->year, true);
        Model::validateRequired('month', $this->month, true);
        Model::validateRequired('clientId', $this->clientId, true);
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
        if (null !== $this->year) {
            $res['year'] = $this->year;
        }
        if (null !== $this->month) {
            $res['month'] = $this->month;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiusageTenantRequest
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
        if (isset($map['year'])) {
            $model->year = $map['year'];
        }
        if (isset($map['month'])) {
            $model->month = $map['month'];
        }
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }

        return $model;
    }
}
