<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractAccountsealRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

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

    // 印章宽度, 默认95px
    /**
     * @var int
     */
    public $width;

    // 模板类型, 详见个人印章样式说明 SQUARE, BORDERLESS, FZKC, HWLS, HWXK, HWXKBORDER, HYLSF, RECTANGLE, YGYJFCS, YGYMBXS, YYGXSF
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountId'         => 'account_id',
        'alias'             => 'alias',
        'color'             => 'color',
        'height'            => 'height',
        'width'             => 'width',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('color', $this->color, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractAccountsealRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
