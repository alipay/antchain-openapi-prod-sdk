<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOTMT\Models;

use AlibabaCloud\Tea\Model;

class QueryApiusageRequest extends Model
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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'year'              => 'year',
        'month'             => 'month',
    ];

    public function validate()
    {
        Model::validateRequired('year', $this->year, true);
        Model::validateRequired('month', $this->month, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiusageRequest
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

        return $model;
    }
}
