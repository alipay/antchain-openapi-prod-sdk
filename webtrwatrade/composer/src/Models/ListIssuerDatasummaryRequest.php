<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class ListIssuerDatasummaryRequest extends Model
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

    // 币种（目前支持USD、HKD）
    /**
     * @var string
     */
    public $currency;

    // 开始时间(格式：YYYY-MM-DD)
    /**
     * @var string
     */
    public $beginDate;

    // 截止时间(格式：YYYY-MM-DD)
    /**
     * @var string
     */
    public $endDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'currency'          => 'currency',
        'beginDate'         => 'begin_date',
        'endDate'           => 'end_date',
    ];

    public function validate()
    {
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
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->beginDate) {
            $res['begin_date'] = $this->beginDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListIssuerDatasummaryRequest
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
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['begin_date'])) {
            $model->beginDate = $map['begin_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }

        return $model;
    }
}
