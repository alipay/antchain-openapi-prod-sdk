<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryBclComplaineventidsRequest extends Model
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

    // 客诉单开始时间
    /**
     * @var string
     */
    public $startDate;

    // 客诉单结束时间
    /**
     * @var string
     */
    public $endDate;

    // 每页数量
    /**
     * @var int
     */
    public $pageSize;

    // 页码
    /**
     * @var int
     */
    public $pageNum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'startDate'         => 'start_date',
        'endDate'           => 'end_date',
        'pageSize'          => 'page_size',
        'pageNum'           => 'page_num',
    ];

    public function validate()
    {
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateMaxLength('startDate', $this->startDate, 16);
        Model::validateMaxLength('endDate', $this->endDate, 16);
        Model::validateMinimum('pageNum', $this->pageNum, 1);
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
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBclComplaineventidsRequest
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
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }

        return $model;
    }
}
