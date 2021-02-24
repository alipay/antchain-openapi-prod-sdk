<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopRisklabelRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'mctOneId' => 'mct_one_id',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'scrollId' => 'scroll_id',
        'tagId' => 'tag_id',
        'updateDate' => 'update_date',
    ];
    public function validate() {
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('updateDate', $this->updateDate, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->mctOneId) {
            $res['mct_one_id'] = $this->mctOneId;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->scrollId) {
            $res['scroll_id'] = $this->scrollId;
        }
        if (null !== $this->tagId) {
            $res['tag_id'] = $this->tagId;
        }
        if (null !== $this->updateDate) {
            $res['update_date'] = $this->updateDate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRtopRisklabelRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['mct_one_id'])){
            $model->mctOneId = $map['mct_one_id'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['scroll_id'])){
            $model->scrollId = $map['scroll_id'];
        }
        if(isset($map['tag_id'])){
            $model->tagId = $map['tag_id'];
        }
        if(isset($map['update_date'])){
            $model->updateDate = $map['update_date'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // mct_one_id  -- search after使用
    /**
     * @var string
     */
    public $mctOneId;

    // pageNo
    /**
     * @var int
     */
    public $pageNo;

    // pageSize
    /**
     * @var int
     */
    public $pageSize;

    // scroll_id
    /**
     * @var string
     */
    public $scrollId;

    // tag_id  -- search after使用
    /**
     * @var string
     */
    public $tagId;

    // 数据更新日期
    /**
     * @var string
     */
    public $updateDate;

}
