<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class TransactionEdge extends Model
{
    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // source
    /**
     * @example 1
     *
     * @var int
     */
    public $source;

    // target
    /**
     * @example 1
     *
     * @var int
     */
    public $target;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // content
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // isError
    /**
     * @example true
     *
     * @var bool
     */
    public $isError;

    // error_message
    /**
     * @example error_message
     *
     * @var string
     */
    public $errorMessage;
    protected $_name = [
        'id'           => 'id',
        'source'       => 'source',
        'target'       => 'target',
        'type'         => 'type',
        'content'      => 'content',
        'isError'      => 'is_error',
        'errorMessage' => 'error_message',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('target', $this->target, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('isError', $this->isError, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->isError) {
            $res['is_error'] = $this->isError;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionEdge
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['is_error'])) {
            $model->isError = $map['is_error'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }

        return $model;
    }
}
