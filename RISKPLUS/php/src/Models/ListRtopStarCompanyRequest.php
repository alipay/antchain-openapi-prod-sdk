<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ListRtopStarCompanyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
    ];
    public function validate() {
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListRtopStarCompanyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
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

    // 页码
    /**
     * @var int
     */
    public $pageNo;

    // 一页条数
    /**
     * @var int
     */
    public $pageSize;

}
