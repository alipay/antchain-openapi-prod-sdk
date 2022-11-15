<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDomesticTrademarkRequest extends Model
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

    // 商标名称
    /**
     * @var string
     */
    public $tmName;

    // 商标注册证号
    /**
     * @var string
     */
    public $tmRegNum;

    // 商标所有人名称
    /**
     * @var string
     */
    public $tmOwnerName;

    // 商标所有人社会信用统一代码
    /**
     * @var string
     */
    public $tmOwnerUscc;

    // 数据集ID
    /**
     * @var string
     */
    public $dataSetId;

    // 每页的数量
    /**
     * @var int
     */
    public $pageSize;

    // 当前页码，从0开始。
    /**
     * @var int
     */
    public $pageNum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tmName'            => 'tm_name',
        'tmRegNum'          => 'tm_reg_num',
        'tmOwnerName'       => 'tm_owner_name',
        'tmOwnerUscc'       => 'tm_owner_uscc',
        'dataSetId'         => 'data_set_id',
        'pageSize'          => 'page_size',
        'pageNum'           => 'page_num',
    ];

    public function validate()
    {
        Model::validateRequired('dataSetId', $this->dataSetId, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
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
        if (null !== $this->tmName) {
            $res['tm_name'] = $this->tmName;
        }
        if (null !== $this->tmRegNum) {
            $res['tm_reg_num'] = $this->tmRegNum;
        }
        if (null !== $this->tmOwnerName) {
            $res['tm_owner_name'] = $this->tmOwnerName;
        }
        if (null !== $this->tmOwnerUscc) {
            $res['tm_owner_uscc'] = $this->tmOwnerUscc;
        }
        if (null !== $this->dataSetId) {
            $res['data_set_id'] = $this->dataSetId;
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
     * @return QueryDomesticTrademarkRequest
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
        if (isset($map['tm_name'])) {
            $model->tmName = $map['tm_name'];
        }
        if (isset($map['tm_reg_num'])) {
            $model->tmRegNum = $map['tm_reg_num'];
        }
        if (isset($map['tm_owner_name'])) {
            $model->tmOwnerName = $map['tm_owner_name'];
        }
        if (isset($map['tm_owner_uscc'])) {
            $model->tmOwnerUscc = $map['tm_owner_uscc'];
        }
        if (isset($map['data_set_id'])) {
            $model->dataSetId = $map['data_set_id'];
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
