<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class HoloxCheckResult extends Model
{
    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $sucess;

    // 本次调用id
    /**
     * @example 234234
     *
     * @var string
     */
    public $id;

    // 场景码
    /**
     * @example 23
     *
     * @var string
     */
    public $sceneCode;

    // 结果码
    /**
     * @example Success
     *
     * @var string
     */
    public $resultCode;

    // 错误码
    /**
     * @example error
     *
     * @var string
     */
    public $errorCode;

    // 结果信息
    /**
     * @example error
     *
     * @var string
     */
    public $resultMessage;

    // 213
    /**
     * @example 123
     *
     * @var string
     */
    public $warnAction;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $contentPropertyOutputResultMap;

    // 213
    /**
     * @example 123
     *
     * @var string
     */
    public $hitResultItems;
    protected $_name = [
        'sucess'                         => 'sucess',
        'id'                             => 'id',
        'sceneCode'                      => 'scene_code',
        'resultCode'                     => 'result_code',
        'errorCode'                      => 'error_code',
        'resultMessage'                  => 'result_message',
        'warnAction'                     => 'warn_action',
        'contentPropertyOutputResultMap' => 'content_property_output_result_map',
        'hitResultItems'                 => 'hit_result_items',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('contentPropertyOutputResultMap', $this->contentPropertyOutputResultMap, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sucess) {
            $res['sucess'] = $this->sucess;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->resultMessage) {
            $res['result_message'] = $this->resultMessage;
        }
        if (null !== $this->warnAction) {
            $res['warn_action'] = $this->warnAction;
        }
        if (null !== $this->contentPropertyOutputResultMap) {
            $res['content_property_output_result_map'] = $this->contentPropertyOutputResultMap;
        }
        if (null !== $this->hitResultItems) {
            $res['hit_result_items'] = $this->hitResultItems;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HoloxCheckResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sucess'])) {
            $model->sucess = $map['sucess'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['result_message'])) {
            $model->resultMessage = $map['result_message'];
        }
        if (isset($map['warn_action'])) {
            $model->warnAction = $map['warn_action'];
        }
        if (isset($map['content_property_output_result_map'])) {
            $model->contentPropertyOutputResultMap = $map['content_property_output_result_map'];
        }
        if (isset($map['hit_result_items'])) {
            $model->hitResultItems = $map['hit_result_items'];
        }

        return $model;
    }
}
