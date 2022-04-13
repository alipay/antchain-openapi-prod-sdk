<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HasHookConfig extends Model
{
    // 前置脚本类型，巡检或预案
    /**
     * @example 01
     *
     * @var string
     */
    public $preType;

    // 前置巡检或预案id
    /**
     * @example test
     *
     * @var string
     */
    public $preRefId;

    // 前置巡检或预案名称
    /**
     * @example test
     *
     * @var string
     */
    public $preName;

    // 前置巡检或预案参数
    /**
     * @example aaa
     *
     * @var string
     */
    public $preParam;

    // 后置脚本类型，巡检或预案
    /**
     * @example 01
     *
     * @var string
     */
    public $postType;

    // 后置巡检或预案id
    /**
     * @example test
     *
     * @var string
     */
    public $postRefId;

    // 后置巡检或预案参数
    /**
     * @example aaa
     *
     * @var string
     */
    public $postParam;

    // 后置巡检或预案名称
    /**
     * @example test
     *
     * @var string
     */
    public $postName;
    protected $_name = [
        'preType'   => 'pre_type',
        'preRefId'  => 'pre_ref_id',
        'preName'   => 'pre_name',
        'preParam'  => 'pre_param',
        'postType'  => 'post_type',
        'postRefId' => 'post_ref_id',
        'postParam' => 'post_param',
        'postName'  => 'post_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->preType) {
            $res['pre_type'] = $this->preType;
        }
        if (null !== $this->preRefId) {
            $res['pre_ref_id'] = $this->preRefId;
        }
        if (null !== $this->preName) {
            $res['pre_name'] = $this->preName;
        }
        if (null !== $this->preParam) {
            $res['pre_param'] = $this->preParam;
        }
        if (null !== $this->postType) {
            $res['post_type'] = $this->postType;
        }
        if (null !== $this->postRefId) {
            $res['post_ref_id'] = $this->postRefId;
        }
        if (null !== $this->postParam) {
            $res['post_param'] = $this->postParam;
        }
        if (null !== $this->postName) {
            $res['post_name'] = $this->postName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HasHookConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pre_type'])) {
            $model->preType = $map['pre_type'];
        }
        if (isset($map['pre_ref_id'])) {
            $model->preRefId = $map['pre_ref_id'];
        }
        if (isset($map['pre_name'])) {
            $model->preName = $map['pre_name'];
        }
        if (isset($map['pre_param'])) {
            $model->preParam = $map['pre_param'];
        }
        if (isset($map['post_type'])) {
            $model->postType = $map['post_type'];
        }
        if (isset($map['post_ref_id'])) {
            $model->postRefId = $map['post_ref_id'];
        }
        if (isset($map['post_param'])) {
            $model->postParam = $map['post_param'];
        }
        if (isset($map['post_name'])) {
            $model->postName = $map['post_name'];
        }

        return $model;
    }
}
