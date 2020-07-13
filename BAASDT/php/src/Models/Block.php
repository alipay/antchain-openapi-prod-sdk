<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Block extends Model {
    protected $_name = [
        'body' => 'body',
        'header' => 'header',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->body) {
            $res['body'] = null !== $this->body ? $this->body->toMap() : null;
        }
        if (null !== $this->header) {
            $res['header'] = null !== $this->header ? $this->header->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Block
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['body'])){
            $model->body = BlockBody::fromMap($map['body']);
        }
        if(isset($map['header'])){
            $model->header = BlockHeader::fromMap($map['header']);
        }
        return $model;
    }
    // 区块体
    /**
     * @example 
     * @var BlockBody
     */
    public $body;

    // 区块头
    /**
     * @example 
     * @var BlockHeader
     */
    public $header;

}
