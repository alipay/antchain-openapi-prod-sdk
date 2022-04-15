<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRbbRegdatasyncPreparedRequest extends Model
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

    // 查询该bizDate数据分区的数据是否已经准备好
    /**
     * @var string
     */
    public $bizDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizDate'           => 'biz_date',
    ];

    public function validate()
    {
        Model::validateRequired('bizDate', $this->bizDate, true);
        Model::validateMaxLength('bizDate', $this->bizDate, 8);
        Model::validateMinLength('bizDate', $this->bizDate, 8);
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
        if (null !== $this->bizDate) {
            $res['biz_date'] = $this->bizDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRbbRegdatasyncPreparedRequest
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
        if (isset($map['biz_date'])) {
            $model->bizDate = $map['biz_date'];
        }

        return $model;
    }
}
