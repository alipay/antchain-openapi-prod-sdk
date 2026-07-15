<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarOtamodulepageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'trustProductKey' => 'trust_product_key',
        'moduleName' => 'module_name',
        'current' => 'current',
        'pageSize' => 'page_size',
    ];
    public function validate() {
        Model::validateRequired('trustProductKey', $this->trustProductKey, true);
        Model::validateRequired('current', $this->current, true);
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
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryElectrocarOtamodulepageRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['module_name'])){
            $model->moduleName = $map['module_name'];
        }
        if(isset($map['current'])){
            $model->current = $map['current'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
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

    // 可信物联唯一产品标识
    /**
     * @var string
     */
    public $trustProductKey;

    // 模块名称
    /**
     * @var string
     */
    public $moduleName;

    // 当前页码
    /**
     * @var int
     */
    public $current;

    // 每页显示条数
    /**
     * @var int
     */
    public $pageSize;

}
