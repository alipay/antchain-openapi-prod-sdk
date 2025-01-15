<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class ContentObjVO extends Model
{
    // novice_must_sees
    /**
     * @example
     *
     * @var NoviceMustSee[]
     */
    public $noviceMustSees;

    // popular_document
    /**
     * @example
     *
     * @var PopularDocument[]
     */
    public $popularDocument;

    // product_presentation
    /**
     * @example 12
     *
     * @var string
     */
    public $productPresentation;
    protected $_name = [
        'noviceMustSees'      => 'novice_must_sees',
        'popularDocument'     => 'popular_document',
        'productPresentation' => 'product_presentation',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->noviceMustSees) {
            $res['novice_must_sees'] = [];
            if (null !== $this->noviceMustSees && \is_array($this->noviceMustSees)) {
                $n = 0;
                foreach ($this->noviceMustSees as $item) {
                    $res['novice_must_sees'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->popularDocument) {
            $res['popular_document'] = [];
            if (null !== $this->popularDocument && \is_array($this->popularDocument)) {
                $n = 0;
                foreach ($this->popularDocument as $item) {
                    $res['popular_document'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->productPresentation) {
            $res['product_presentation'] = $this->productPresentation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentObjVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['novice_must_sees'])) {
            if (!empty($map['novice_must_sees'])) {
                $model->noviceMustSees = [];
                $n                     = 0;
                foreach ($map['novice_must_sees'] as $item) {
                    $model->noviceMustSees[$n++] = null !== $item ? NoviceMustSee::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['popular_document'])) {
            if (!empty($map['popular_document'])) {
                $model->popularDocument = [];
                $n                      = 0;
                foreach ($map['popular_document'] as $item) {
                    $model->popularDocument[$n++] = null !== $item ? PopularDocument::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['product_presentation'])) {
            $model->productPresentation = $map['product_presentation'];
        }

        return $model;
    }
}
