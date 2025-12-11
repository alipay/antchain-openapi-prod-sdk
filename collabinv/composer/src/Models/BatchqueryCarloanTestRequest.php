<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryCarloanTestRequest extends Model
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

    // 日期
    /**
     * @var string
     */
    public $date;

    // 查询条数
    /**
     * @var int
     */
    public $dataNum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'date'              => 'date',
        'dataNum'           => 'data_num',
    ];

    public function validate()
    {
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('dataNum', $this->dataNum, true);
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
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->dataNum) {
            $res['data_num'] = $this->dataNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryCarloanTestRequest
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
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['data_num'])) {
            $model->dataNum = $map['data_num'];
        }

        return $model;
    }
}
