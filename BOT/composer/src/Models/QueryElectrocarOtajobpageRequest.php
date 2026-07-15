<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarOtajobpageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'current' => 'current',
        'pageSize' => 'page_size',
        'trustProductKey' => 'trust_product_key',
        'firmwareId' => 'firmware_id',
    ];
    public function validate() {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('trustProductKey', $this->trustProductKey, true);
        Model::validateRequired('firmwareId', $this->firmwareId, true);
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
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->firmwareId) {
            $res['firmware_id'] = $this->firmwareId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryElectrocarOtajobpageRequest
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
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['firmware_id'])){
            $model->firmwareId = $map['firmware_id'];
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

    // 可信物联唯一产品标识
    /**
     * @var string
     */
    public $trustProductKey;

    // OTA固件包id不能为空
    /**
     * @var string
     */
    public $firmwareId;

}
