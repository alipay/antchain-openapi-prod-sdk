<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractComplaineventidsRequest extends Model
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

    // 客诉单创建开始日期
    /**
     * @var string
     */
    public $complainStartDate;

    // 客诉单创建开始日期
    /**
     * @var string
     */
    public $complainEndDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'complainStartDate' => 'complain_start_date',
        'complainEndDate'   => 'complain_end_date',
    ];

    public function validate()
    {
        Model::validateRequired('complainStartDate', $this->complainStartDate, true);
        Model::validateRequired('complainEndDate', $this->complainEndDate, true);
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
        if (null !== $this->complainStartDate) {
            $res['complain_start_date'] = $this->complainStartDate;
        }
        if (null !== $this->complainEndDate) {
            $res['complain_end_date'] = $this->complainEndDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractComplaineventidsRequest
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
        if (isset($map['complain_start_date'])) {
            $model->complainStartDate = $map['complain_start_date'];
        }
        if (isset($map['complain_end_date'])) {
            $model->complainEndDate = $map['complain_end_date'];
        }

        return $model;
    }
}
