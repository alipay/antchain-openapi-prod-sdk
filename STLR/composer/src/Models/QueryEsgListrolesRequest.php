<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryEsgListrolesRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'current' => 'current',
        'pageSize' => 'page_size',
        'name' => 'name',
        'enterpriseNo' => 'enterprise_no',
    ];
    public function validate() {
        Model::validateRequired('enterpriseNo', $this->enterpriseNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->enterpriseNo) {
            $res['enterprise_no'] = $this->enterpriseNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryEsgListrolesRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['current'])){
            $model->current = $map['current'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['enterprise_no'])){
            $model->enterpriseNo = $map['enterprise_no'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 当前默认为1的页码
    /**
     * @var int
     */
    public $current;

    // 页数 默认为20
    /**
     * @var int
     */
    public $pageSize;

    // 角色名称搜索条件
    /**
     * @var string
     */
    public $name;

    // verifyToken中的企业编码
    /**
     * @var string
     */
    public $enterpriseNo;

}
