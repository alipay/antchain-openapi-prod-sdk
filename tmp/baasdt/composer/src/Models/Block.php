<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Block extends Model
{
    // 区块头
    /**
     * @example
     *
     * @var BlockHeader
     */
    public $header;

    // 区块体
    /**
     * @example
     *
     * @var BlockBody
     */
    public $body;
    protected $_name = [
        'header' => 'header',
        'body'   => 'body',
    ];

    public function validate()
    {
        Model::validateRequired('header', $this->header, true);
        Model::validateRequired('body', $this->body, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->header) {
            $res['header'] = null !== $this->header ? $this->header->toMap() : null;
        }
        if (null !== $this->body) {
            $res['body'] = null !== $this->body ? $this->body->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Block
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['header'])) {
            $model->header = BlockHeader::fromMap($map['header']);
        }
        if (isset($map['body'])) {
            $model->body = BlockBody::fromMap($map['body']);
        }

        return $model;
    }
}
