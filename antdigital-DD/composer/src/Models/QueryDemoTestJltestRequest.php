<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryDemoTestJltestRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'data' => 'data',
        'datax' => 'datax',
        'datay' => 'datay',
        'dataa' => 'dataa',
    ];
    public function validate() {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('datax', $this->datax, true);
        Model::validateRequired('datay', $this->datay, true);
        Model::validateRequired('dataa', $this->dataa, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->datax) {
            $res['datax'] = $this->datax;
        }
        if (null !== $this->datay) {
            $res['datay'] = $this->datay;
        }
        if (null !== $this->dataa) {
            $res['dataa'] = $this->dataa;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDemoTestJltestRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        if(isset($map['datax'])){
            $model->datax = $map['datax'];
        }
        if(isset($map['datay'])){
            $model->datay = $map['datay'];
        }
        if(isset($map['dataa'])){
            $model->dataa = $map['dataa'];
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

    // 数据
    /**
     * @var string
     */
    public $data;

    // 数据bbb
    /**
     * @var string
     */
    public $datax;

    // 数据bbb
    /**
     * @var string
     */
    public $datay;

    // 数据ddd
    /**
     * @var string
     */
    public $dataa;

}
