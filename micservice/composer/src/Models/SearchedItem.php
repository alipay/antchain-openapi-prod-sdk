<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MICSERVICE\Models;

use AlibabaCloud\Tea\Model;

class SearchedItem extends Model
{
    // 用户id
    /**
     * @example userIdxx
     *
     * @var string
     */
    public $userId;

    // 业务流程唯一id
    /**
     * @example bizIdxxx
     *
     * @var string
     */
    public $bizId;

    // 场景id
    /**
     * @example YIBAO_FACEVERIFY
     *
     * @var string
     */
    public $sceneId;

    // 如余弦相似度(-1,1)
    /**
     * @example 相似度
     *
     * @var string
     */
    public $similarity;

    // 扩展字段，string类型，json格式
    /**
     * @example {"key":"value"}
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'userId'     => 'user_id',
        'bizId'      => 'biz_id',
        'sceneId'    => 'scene_id',
        'similarity' => 'similarity',
        'extInfo'    => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('similarity', $this->similarity, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->similarity) {
            $res['similarity'] = $this->similarity;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SearchedItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['similarity'])) {
            $model->similarity = $map['similarity'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
