<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class PopularDocument extends Model
{
    // popular_document_title
    /**
     * @example ""
     *
     * @var string
     */
    public $popularDocumentTitle;

    // popular_document_id
    /**
     * @example ""
     *
     * @var string
     */
    public $popularDocumentId;

    // popular_document_info
    /**
     * @example ""
     *
     * @var string
     */
    public $popularDocumentInfo;

    // children
    /**
     * @example
     *
     * @var CategoryVO[]
     */
    public $children;
    protected $_name = [
        'popularDocumentTitle' => 'popular_document_title',
        'popularDocumentId'    => 'popular_document_id',
        'popularDocumentInfo'  => 'popular_document_info',
        'children'             => 'children',
    ];

    public function validate()
    {
        Model::validateRequired('children', $this->children, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->popularDocumentTitle) {
            $res['popular_document_title'] = $this->popularDocumentTitle;
        }
        if (null !== $this->popularDocumentId) {
            $res['popular_document_id'] = $this->popularDocumentId;
        }
        if (null !== $this->popularDocumentInfo) {
            $res['popular_document_info'] = $this->popularDocumentInfo;
        }
        if (null !== $this->children) {
            $res['children'] = [];
            if (null !== $this->children && \is_array($this->children)) {
                $n = 0;
                foreach ($this->children as $item) {
                    $res['children'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PopularDocument
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['popular_document_title'])) {
            $model->popularDocumentTitle = $map['popular_document_title'];
        }
        if (isset($map['popular_document_id'])) {
            $model->popularDocumentId = $map['popular_document_id'];
        }
        if (isset($map['popular_document_info'])) {
            $model->popularDocumentInfo = $map['popular_document_info'];
        }
        if (isset($map['children'])) {
            if (!empty($map['children'])) {
                $model->children = [];
                $n               = 0;
                foreach ($map['children'] as $item) {
                    $model->children[$n++] = null !== $item ? CategoryVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
