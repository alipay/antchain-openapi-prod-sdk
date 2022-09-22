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
     * @example []
     *
     * @var TemplateParam[]
     */
    public $preParams;

    // 前置是否需要确认
    /**
     * @example true, false
     *
     * @var bool
     */
    public $preNeedConfirm;

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

    // 后置巡检或预案名称
    /**
     * @example test
     *
     * @var string
     */
    public $postName;

    // 后置巡检或预案参数
    /**
     * @example []
     *
     * @var TemplateParam[]
     */
    public $postParams;

    // 后置是否需要确认
    /**
     * @example true, false
     *
     * @var bool
     */
    public $postNeedConfirm;
    protected $_name = [
        'preType'         => 'pre_type',
        'preRefId'        => 'pre_ref_id',
        'preName'         => 'pre_name',
        'preParams'       => 'pre_params',
        'preNeedConfirm'  => 'pre_need_confirm',
        'postType'        => 'post_type',
        'postRefId'       => 'post_ref_id',
        'postName'        => 'post_name',
        'postParams'      => 'post_params',
        'postNeedConfirm' => 'post_need_confirm',
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
        if (null !== $this->preParams) {
            $res['pre_params'] = [];
            if (null !== $this->preParams && \is_array($this->preParams)) {
                $n = 0;
                foreach ($this->preParams as $item) {
                    $res['pre_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->preNeedConfirm) {
            $res['pre_need_confirm'] = $this->preNeedConfirm;
        }
        if (null !== $this->postType) {
            $res['post_type'] = $this->postType;
        }
        if (null !== $this->postRefId) {
            $res['post_ref_id'] = $this->postRefId;
        }
        if (null !== $this->postName) {
            $res['post_name'] = $this->postName;
        }
        if (null !== $this->postParams) {
            $res['post_params'] = [];
            if (null !== $this->postParams && \is_array($this->postParams)) {
                $n = 0;
                foreach ($this->postParams as $item) {
                    $res['post_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->postNeedConfirm) {
            $res['post_need_confirm'] = $this->postNeedConfirm;
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
        if (isset($map['pre_params'])) {
            if (!empty($map['pre_params'])) {
                $model->preParams = [];
                $n                = 0;
                foreach ($map['pre_params'] as $item) {
                    $model->preParams[$n++] = null !== $item ? TemplateParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pre_need_confirm'])) {
            $model->preNeedConfirm = $map['pre_need_confirm'];
        }
        if (isset($map['post_type'])) {
            $model->postType = $map['post_type'];
        }
        if (isset($map['post_ref_id'])) {
            $model->postRefId = $map['post_ref_id'];
        }
        if (isset($map['post_name'])) {
            $model->postName = $map['post_name'];
        }
        if (isset($map['post_params'])) {
            if (!empty($map['post_params'])) {
                $model->postParams = [];
                $n                 = 0;
                foreach ($map['post_params'] as $item) {
                    $model->postParams[$n++] = null !== $item ? TemplateParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['post_need_confirm'])) {
            $model->postNeedConfirm = $map['post_need_confirm'];
        }

        return $model;
    }
}
