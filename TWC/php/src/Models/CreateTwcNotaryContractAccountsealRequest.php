<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateTwcNotaryContractAccountsealRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'accountId' => 'account_id',
        'alias' => 'alias',
        'color' => 'color',
        'height' => 'height',
        'type' => 'type',
        'width' => 'width',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryContractAccountsealRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
        }
        if(isset($map['alias'])){
            $model->alias = $map['alias'];
        }
        if(isset($map['color'])){
            $model->color = $map['color'];
        }
        if(isset($map['height'])){
            $model->height = $map['height'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['width'])){
            $model->width = $map['width'];
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

    /**
     * @var string
     */
    public $regionName;

    // 电子合同用户ID（在twc.notary.contract.account.create接口中创建）
    /**
     * @var string
     */
    public $accountId;

    // 印章别名
    /**
     * @var string
     */
    public $alias;

    // 印章颜色，RED-红色， BLUE-蓝色，BLACK-黑色
    /**
     * @var string
     */
    public $color;

    // 印章高度, 默认95px
    /**
     * @var int
     */
    public $height;

    // 模板类型, 详见个人印章样式说明 SQUARE, BORDERLESS, FZKC, HWLS, HWXK, HWXKBORDER, HYLSF, RECTANGLE, YGYJFCS, YGYMBXS, YYGXSF
    /**
     * @var string
     */
    public $type;

    // 印章宽度, 默认95px
    /**
     * @var int
     */
    public $width;

}
