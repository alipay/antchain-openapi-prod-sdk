<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CodeCirculation extends Model
{
    // 正版码的编码
    /**
     * @example 82d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $code;

    // 流转信息标题
    /**
     * @example 领取
     *
     * @var string
     */
    public $title;

    // 流转详细信息
    /**
     * @example 流转详细信息
     *
     * @var string
     */
    public $content;

    // 哈希值
    /**
     * @example 哈希值
     *
     * @var string
     */
    public $hash;

    // 流转时间
    /**
     * @example 1694896477580
     *
     * @var int
     */
    public $time;
    protected $_name = [
        'code'    => 'code',
        'title'   => 'title',
        'content' => 'content',
        'hash'    => 'hash',
        'time'    => 'time',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CodeCirculation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }

        return $model;
    }
}
