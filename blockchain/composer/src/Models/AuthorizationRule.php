<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AuthorizationRule extends Model
{
    // 规则来源
    /**
     * @example DID
     *
     * @var string
     */
    public $source;

    // 规则索引
    /**
     * @example serviceType
     *
     * @var string
     */
    public $index;

    // 规则类型
    /**
     * @example DEFAULT
     *
     * @var string
     */
    public $type;

    // 规则表达式
    /**
     * @example EQUALS
     *
     * @var string
     */
    public $expression;

    // 规则内容
    /**
     * @example content
     *
     * @var string
     */
    public $content;
    protected $_name = [
        'source'     => 'source',
        'index'      => 'index',
        'type'       => 'type',
        'expression' => 'expression',
        'content'    => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('index', $this->index, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('expression', $this->expression, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->expression) {
            $res['expression'] = $this->expression;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthorizationRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['expression'])) {
            $model->expression = $map['expression'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
