<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class UploadRequest extends Model
{
    // 文件流/文件地址
    /**
     * @example http://actamweb.oss-cn-hzfinance.aliyuncs.com/tmp/2021-09-
     *
     * @var string
     */
    public $stream;

    // 文件名称
    /**
     * @example 项目说明
     *
     * @var string
     */
    public $filename;

    // 内外工号
    /**
     * @example 00124314
     *
     * @var string
     */
    public $user;

    // 附件的关联对象类型
    /**
     * @example Issue
     *
     * @var string
     */
    public $targetType;

    // 附件的关联对象ID
    /**
     * @example 12412
     *
     * @var int
     */
    public $targetId;
    protected $_name = [
        'stream'     => 'stream',
        'filename'   => 'filename',
        'user'       => 'user',
        'targetType' => 'target_type',
        'targetId'   => 'target_id',
    ];

    public function validate()
    {
        Model::validateRequired('stream', $this->stream, true);
        Model::validateRequired('filename', $this->filename, true);
        Model::validateRequired('user', $this->user, true);
        Model::validateRequired('targetType', $this->targetType, true);
        Model::validateRequired('targetId', $this->targetId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stream) {
            $res['stream'] = $this->stream;
        }
        if (null !== $this->filename) {
            $res['filename'] = $this->filename;
        }
        if (null !== $this->user) {
            $res['user'] = $this->user;
        }
        if (null !== $this->targetType) {
            $res['target_type'] = $this->targetType;
        }
        if (null !== $this->targetId) {
            $res['target_id'] = $this->targetId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['stream'])) {
            $model->stream = $map['stream'];
        }
        if (isset($map['filename'])) {
            $model->filename = $map['filename'];
        }
        if (isset($map['user'])) {
            $model->user = $map['user'];
        }
        if (isset($map['target_type'])) {
            $model->targetType = $map['target_type'];
        }
        if (isset($map['target_id'])) {
            $model->targetId = $map['target_id'];
        }

        return $model;
    }
}
