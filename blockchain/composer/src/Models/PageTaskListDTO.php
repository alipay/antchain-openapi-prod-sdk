<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PageTaskListDTO extends Model
{
    // 任务列表集合
    /**
     * @example
     *
     * @var TaskListInfoDTO[]
     */
    public $content;

    // 总记录条目
    /**
     * @example 6
     *
     * @var int
     */
    public $totalElements;

    // 记录总页数
    /**
     * @example 20
     *
     * @var int
     */
    public $totalPages;

    // 页码
    /**
     * @example 0
     *
     * @var int
     */
    public $number;

    // 每页记录条目
    /**
     * @example 6
     *
     * @var int
     */
    public $size;

    // 每页元素个数
    /**
     * @example
     *
     * @var int
     */
    public $numberOfElements;
    protected $_name = [
        'content'          => 'content',
        'totalElements'    => 'total_elements',
        'totalPages'       => 'total_pages',
        'number'           => 'number',
        'size'             => 'size',
        'numberOfElements' => 'number_of_elements',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('totalElements', $this->totalElements, true);
        Model::validateRequired('totalPages', $this->totalPages, true);
        Model::validateRequired('number', $this->number, true);
        Model::validateRequired('size', $this->size, true);
        Model::validateRequired('numberOfElements', $this->numberOfElements, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = [];
            if (null !== $this->content && \is_array($this->content)) {
                $n = 0;
                foreach ($this->content as $item) {
                    $res['content'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalElements) {
            $res['total_elements'] = $this->totalElements;
        }
        if (null !== $this->totalPages) {
            $res['total_pages'] = $this->totalPages;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->numberOfElements) {
            $res['number_of_elements'] = $this->numberOfElements;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PageTaskListDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            if (!empty($map['content'])) {
                $model->content = [];
                $n              = 0;
                foreach ($map['content'] as $item) {
                    $model->content[$n++] = null !== $item ? TaskListInfoDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_elements'])) {
            $model->totalElements = $map['total_elements'];
        }
        if (isset($map['total_pages'])) {
            $model->totalPages = $map['total_pages'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['number_of_elements'])) {
            $model->numberOfElements = $map['number_of_elements'];
        }

        return $model;
    }
}
