<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AICLAIM\Models;

use AlibabaCloud\Tea\Model;

class Document extends Model
{
    // 参考分类接口中返回的分类结果
    /**
     * @example MEDICAL_EXPENSE_INVOICE
     *
     * @var string
     */
    public $docType;

    // 参考分类接口中返回的分类结果
    /**
     * @example 医疗费用发票
     *
     * @var string
     */
    public $docTypeCn;

    // 参考Extraction参数
    /**
     * @example
     *
     * @var Extraction
     */
    public $extraction;

    // 参考Page参数
    /**
     * @example
     *
     * @var Page[]
     */
    public $pages;
    protected $_name = [
        'docType'    => 'doc_type',
        'docTypeCn'  => 'doc_type_cn',
        'extraction' => 'extraction',
        'pages'      => 'pages',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->docType) {
            $res['doc_type'] = $this->docType;
        }
        if (null !== $this->docTypeCn) {
            $res['doc_type_cn'] = $this->docTypeCn;
        }
        if (null !== $this->extraction) {
            $res['extraction'] = null !== $this->extraction ? $this->extraction->toMap() : null;
        }
        if (null !== $this->pages) {
            $res['pages'] = [];
            if (null !== $this->pages && \is_array($this->pages)) {
                $n = 0;
                foreach ($this->pages as $item) {
                    $res['pages'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Document
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['doc_type'])) {
            $model->docType = $map['doc_type'];
        }
        if (isset($map['doc_type_cn'])) {
            $model->docTypeCn = $map['doc_type_cn'];
        }
        if (isset($map['extraction'])) {
            $model->extraction = Extraction::fromMap($map['extraction']);
        }
        if (isset($map['pages'])) {
            if (!empty($map['pages'])) {
                $model->pages = [];
                $n            = 0;
                foreach ($map['pages'] as $item) {
                    $model->pages[$n++] = null !== $item ? Page::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
