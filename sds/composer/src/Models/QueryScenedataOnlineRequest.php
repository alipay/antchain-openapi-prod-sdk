<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class QueryScenedataOnlineRequest extends Model
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

    // 业务号，根据biz_no_type修改类型
    /**
     * @var string
     */
    public $bizNo;

    // 业务号类型
    /**
     * @var string
     */
    public $bizNoType;

    // 场景，根据此参数路由适配到不同数据源
    /**
     * @var string
     */
    public $scene;

    // 来源标识
    /**
     * @var string
     */
    public $sourceMark;

    // 条件，目前只支持IN的逻辑
    /**
     * @var BizNoCondition
     */
    public $condition;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizNo'             => 'biz_no',
        'bizNoType'         => 'biz_no_type',
        'scene'             => 'scene',
        'sourceMark'        => 'source_mark',
        'condition'         => 'condition',
    ];

    public function validate()
    {
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('bizNoType', $this->bizNoType, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateMaxLength('bizNo', $this->bizNo, 256);
        Model::validateMaxLength('bizNoType', $this->bizNoType, 64);
        Model::validateMaxLength('scene', $this->scene, 32);
        Model::validateMaxLength('sourceMark', $this->sourceMark, 32);
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
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->bizNoType) {
            $res['biz_no_type'] = $this->bizNoType;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->sourceMark) {
            $res['source_mark'] = $this->sourceMark;
        }
        if (null !== $this->condition) {
            $res['condition'] = null !== $this->condition ? $this->condition->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryScenedataOnlineRequest
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
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['biz_no_type'])) {
            $model->bizNoType = $map['biz_no_type'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['source_mark'])) {
            $model->sourceMark = $map['source_mark'];
        }
        if (isset($map['condition'])) {
            $model->condition = BizNoCondition::fromMap($map['condition']);
        }

        return $model;
    }
}
