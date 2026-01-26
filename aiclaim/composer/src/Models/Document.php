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
    public $type;

    // 参考分类接口中返回的分类结果
    /**
     * @example 医疗费用发票
     *
     * @var string
     */
    public $typeCn;

    // 细分的分类结果
    /**
     * @example TARGET_INVOICE_OUTPATIENT
     *
     * @var string
     */
    public $subType;

    // 细分的分类结果
    /**
     * @example 门诊发票
     *
     * @var string
     */
    public $subTypeCn;

    // 参考Extraction参数
    /**
     * @example
     *
     * @var Extraction[]
     */
    public $extraction;

    // 参考Page参数
    /**
     * @example
     *
     * @var Page[]
     */
    public $page;
    protected $_name = [
        'type'       => 'type',
        'typeCn'     => 'type_cn',
        'subType'    => 'sub_type',
        'subTypeCn'  => 'sub_type_cn',
        'extraction' => 'extraction',
        'page'       => 'page',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->typeCn) {
            $res['type_cn'] = $this->typeCn;
        }
        if (null !== $this->subType) {
            $res['sub_type'] = $this->subType;
        }
        if (null !== $this->subTypeCn) {
            $res['sub_type_cn'] = $this->subTypeCn;
        }
        if (null !== $this->extraction) {
            $res['extraction'] = [];
            if (null !== $this->extraction && \is_array($this->extraction)) {
                $n = 0;
                foreach ($this->extraction as $item) {
                    $res['extraction'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->page) {
            $res['page'] = [];
            if (null !== $this->page && \is_array($this->page)) {
                $n = 0;
                foreach ($this->page as $item) {
                    $res['page'][$n++] = null !== $item ? $item->toMap() : $item;
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['type_cn'])) {
            $model->typeCn = $map['type_cn'];
        }
        if (isset($map['sub_type'])) {
            $model->subType = $map['sub_type'];
        }
        if (isset($map['sub_type_cn'])) {
            $model->subTypeCn = $map['sub_type_cn'];
        }
        if (isset($map['extraction'])) {
            if (!empty($map['extraction'])) {
                $model->extraction = [];
                $n                 = 0;
                foreach ($map['extraction'] as $item) {
                    $model->extraction[$n++] = null !== $item ? Extraction::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page'])) {
            if (!empty($map['page'])) {
                $model->page = [];
                $n           = 0;
                foreach ($map['page'] as $item) {
                    $model->page[$n++] = null !== $item ? Page::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
