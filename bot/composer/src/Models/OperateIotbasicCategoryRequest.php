<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicCategoryRequest extends Model
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

    // 品类名称
    /**
     * @var string
     */
    public $categoryName;

    // 行业
    /**
     * @var string
     */
    public $industry;

    // 场景
    /**
     * @var string
     */
    public $scene;

    // 品类类型：标准 | 自定义
    /**
     * @var string
     */
    public $categoryType;

    // 描述内容
    /**
     * @var string
     */
    public $remark;

    // 操作类型
    /**
     * @var string
     */
    public $action;

    // 操作人id
    /**
     * @var string
     */
    public $operatorId;

    // 参数签名校验
    /**
     * @var string
     */
    public $paramSign;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'categoryName'      => 'category_name',
        'industry'          => 'industry',
        'scene'             => 'scene',
        'categoryType'      => 'category_type',
        'remark'            => 'remark',
        'action'            => 'action',
        'operatorId'        => 'operator_id',
        'paramSign'         => 'param_sign',
    ];

    public function validate()
    {
        Model::validateRequired('categoryName', $this->categoryName, true);
        Model::validateRequired('industry', $this->industry, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('categoryType', $this->categoryType, true);
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('paramSign', $this->paramSign, true);
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
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->categoryType) {
            $res['category_type'] = $this->categoryType;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->paramSign) {
            $res['param_sign'] = $this->paramSign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicCategoryRequest
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
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['category_type'])) {
            $model->categoryType = $map['category_type'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['param_sign'])) {
            $model->paramSign = $map['param_sign'];
        }

        return $model;
    }
}
