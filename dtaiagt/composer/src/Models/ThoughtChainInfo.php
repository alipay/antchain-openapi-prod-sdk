<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ThoughtChainInfo extends Model
{
    // 思维链id
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // "success" | "error" | "loading" | "abort" | "done"
    /**
     * @example success
     *
     * @var string
     */
    public $status;

    // 内容
    /**
     * @example 内容
     *
     * @var ThoughtChainContent[]
     */
    public $content;
    protected $_name = [
        'id'      => 'id',
        'status'  => 'status',
        'content' => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->content) {
            $res['content'] = [];
            if (null !== $this->content && \is_array($this->content)) {
                $n = 0;
                foreach ($this->content as $item) {
                    $res['content'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThoughtChainInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['content'])) {
            if (!empty($map['content'])) {
                $model->content = [];
                $n              = 0;
                foreach ($map['content'] as $item) {
                    $model->content[$n++] = null !== $item ? ThoughtChainContent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
