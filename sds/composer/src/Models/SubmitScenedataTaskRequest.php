<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class SubmitScenedataTaskRequest extends Model
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

    // 约定的场景枚举
    /**
     * @var string
     */
    public $scene;

    // 枚举
    // PHONE_SHA1
    // PHONE_MD5
    /**
     * @var string
     */
    public $bizNoType;

    // 适配客户的来源
    // 可能是客户的任务/AK
    /**
     * @var string
     */
    public $sourceMark;

    // 业务号预期条件
    /**
     * @var BizNoCondition[]
     */
    public $expectCondition;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'bizNoType'         => 'biz_no_type',
        'sourceMark'        => 'source_mark',
        'expectCondition'   => 'expect_condition',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('bizNoType', $this->bizNoType, true);
        Model::validateMaxLength('scene', $this->scene, 32);
        Model::validateMaxLength('bizNoType', $this->bizNoType, 32);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->bizNoType) {
            $res['biz_no_type'] = $this->bizNoType;
        }
        if (null !== $this->sourceMark) {
            $res['source_mark'] = $this->sourceMark;
        }
        if (null !== $this->expectCondition) {
            $res['expect_condition'] = [];
            if (null !== $this->expectCondition && \is_array($this->expectCondition)) {
                $n = 0;
                foreach ($this->expectCondition as $item) {
                    $res['expect_condition'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitScenedataTaskRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['biz_no_type'])) {
            $model->bizNoType = $map['biz_no_type'];
        }
        if (isset($map['source_mark'])) {
            $model->sourceMark = $map['source_mark'];
        }
        if (isset($map['expect_condition'])) {
            if (!empty($map['expect_condition'])) {
                $model->expectCondition = [];
                $n                      = 0;
                foreach ($map['expect_condition'] as $item) {
                    $model->expectCondition[$n++] = null !== $item ? BizNoCondition::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
